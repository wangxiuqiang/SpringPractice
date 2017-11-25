package cn.itcast.test;

import cn.itcast.component.CDPlayConfig;
import cn.itcast.component.CDPlayer;
import cn.itcast.component.impl.AutowiredTest;
import cn.itcast.component.impl.SgtPeppers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayConfig.class)
public class TestCDPlayer {
//   @Autowired
//   private CDPlayer a;
//
//   @Test
//    public  void cdPlayerNotIsNull(){
//      a.paly();
//   }
//
   @Autowired
    AutowiredTest b;

   @Test
    public void SimplePoTestAutowiredTest(){
       b.sgtPeppers.paly();
   }
}
