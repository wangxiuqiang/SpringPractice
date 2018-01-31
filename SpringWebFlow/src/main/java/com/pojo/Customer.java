package com.pojo;

import java.io.Serializable;

public class Customer implements Serializable{
    private static final long serialVersionUID = 1L;
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
