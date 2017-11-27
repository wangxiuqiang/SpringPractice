package cn.allInner.Test;

import cn.allInner.Config.Main.MainConfig;
import cn.allInner.pojo.Impl.DogOne;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MainConfig.class)
public class test {
    /**
     * 用来导入xml的配置文件
     */
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-main.xml");
        DogOne dogOne = (DogOne) context.getBean("dogOne");
        dogOne.run();
    }
//    @Autowired
//    DogOne dogOne;
//    @Test
//    public void test() {
//        dogOne.run();
//    }
}