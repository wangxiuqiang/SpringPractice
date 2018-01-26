package cn.pojo;

import javax.validation.constraints.Size;

public class Test {
    @Size(min = 1,max = 2,message = "{id.length}")
    private String id;

    @Size(min = 1,max = 2,message = "{name.length}")
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
