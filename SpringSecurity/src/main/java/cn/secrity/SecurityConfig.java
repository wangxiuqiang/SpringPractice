package cn.secrity;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

/**
 * 先写SecurityWebInitializer类,在JavaConfig中启动这个而带有@Configuration的类
 * 实现权限的认证,需要 用户存储
 * 指定哪些请求要认证
 * 提供一个自定的登录界面
 *
 * and()方法用在security的方法中,将多个配置连起来,不管是用户存储,还是权限验证
 */

/**
 * 在web 5.0.1下@EnableWenMvcSecurity这个已经找不到了
 */
@Configuration
@EnableWebMvcSecurity  //启用任意webmvc应用的安全功能
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    //inMemoryAuthentication 方法用来添加内存用户存储
    //.withUser().password().roles() 一级一级的用户名,密码,角色
    //and() 用来将多个用户的配置连起来
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("admin").password("admin").roles("USER","ADMIN")
                .and().withUser("user").password("user").roles("USER");
    }
//loginPage设定哪一个url下的界面是进行权限检测的界面
    //.authorizeRequests().antMatchers  表明要跳转到这个url的页面,必须要达到要求才可以跳过去

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin().loginPage("/test")  //这个test的url对应的表单中的action需要是test,其实不管是啥,都跳到 "/"
                //它会跳转到 "/"这个url上,其余的都不成功,可能是没找到合适的方法
         .and()
                .authorizeRequests()
                //下面的这两个是不一样的  因为有HttpMethod.POST , 上面的能限制没有这个Role的
                //不能登录,下面的那个不行,
                .antMatchers("/index").hasRole("USER")
                .antMatchers(HttpMethod.POST,"/index").hasRole("USER")
                /**
                 *
                 限制/failure的路径,只有是登录了,并且用户名是admin的时候才能访问,
                 同时可以在页面上用security的jso标签限制显示内容,就可以使用
                 sec:authorize url='/failure' 然后定义里面的内容
                 不用使用sec:authorize access="isAuthenticated() and principal.username=='admin'"来重复定义了
                 PS:and用来连接连两个条件,使用access可以指定多个保护URL的方法,
                 .hasRole() .authenticated() 等方法只能写其中一个,access比这些好用,支持使用SpEL表达式
                 */
                 .antMatchers("/failure").access("isAuthenticated() and principal.username=='admin'")
                //其他的请求不需要权限,都可以访问
                .anyRequest().permitAll()
                .and()
                //对 "/" 的访问视为需要安全通道的,并自动将请求重定向到https
                   // .requiresChannel().antMatchers("/").requiresSecure()
               // .and()
                //启用rememberMe功能,时间是2419200秒,四个周 ,默认是两个周
                //配置一个私钥 spittrKey,默认是SpringSecured
                //需要在页面中添加个name为remember-me的checkbox
                .rememberMe().tokenValiditySeconds(2419200).key("spittrKey")
        .and()
                //退出,并且定义到退出成功的url
                .logout().logoutSuccessUrl("/test")
                //logout()函数默认让LogoutFilter的拦截是logout的url
                //logoutUrl 重写这一默认的拦截路径
                .logoutUrl("/signout")
                .and()
                //禁用csrf ,不然的话就得在jsp页面上进行hidden的配置
        .csrf()
        .disable();
    }
}
