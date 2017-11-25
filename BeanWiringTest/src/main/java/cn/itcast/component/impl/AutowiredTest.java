package cn.itcast.component.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("b")
public class AutowiredTest {

    public SgtPeppers sgtPeppers;

//    @Autowired
//    public AutowiredTest(SgtPeppers sgtPeppers)
//    {
//        this.sgtPeppers = sgtPeppers;
//    }


//    public SgtPeppers getSgtPeppers() {
//        return sgtPeppers;
//    }
//
//    @Autowired
//    public void setSgtPeppers(SgtPeppers sgtPeppers) {
//        this.sgtPeppers = sgtPeppers;
//    }

    @Autowired
    public void TestOneRandomSimple(SgtPeppers sgtPeppers) {
        this.sgtPeppers = sgtPeppers;
    }
}
