package cn.itcast.component.impl;

import cn.itcast.component.CDPlayer;
import org.springframework.stereotype.Component;

@Component("a")
public class SgtPeppers  implements CDPlayer{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void paly() {
        System.out.println("name is 山丹丹的花开红艳艳;");
    }
}
