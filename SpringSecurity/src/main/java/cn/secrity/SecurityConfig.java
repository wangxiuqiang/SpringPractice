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
@Configuration
@EnableWebMvcSecurity //启用任意webmvc应用的安全功能
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    //inMemoryAuthentication 方法用来添加内存用户存储
    //.withUser().password().roles() 一级一级的用户名,密码,角色
    //and() 用来将多个用户的配置连起来
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("admin").password("admin").roles("USER","ADMIN")
                .and().withUser("user").password("user").roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin().loginPage("/login")
         .and()
                .authorizeRequests().antMatchers(HttpMethod.POST,"/index").hasRole("USER")
                .anyRequest().permitAll()
        .and()
        .csrf()
        .disable();
    }
}
