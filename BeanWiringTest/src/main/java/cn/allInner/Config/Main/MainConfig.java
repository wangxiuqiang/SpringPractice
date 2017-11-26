package cn.allInner.Config.Main;

import cn.allInner.Config.test1Config;
import cn.allInner.Config.test2Config;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * 更高一级的配置类,用来加载另外的类和xml
 */
@Configuration
//@Import({test1Config.class,test2Config.class})  //用来加载两个java配置类

//加载xml和Java配置类
//@Import(test1Config.class)
//@ImportResource("classpath:spring/spring-test2.xml")
public class MainConfig {

}
