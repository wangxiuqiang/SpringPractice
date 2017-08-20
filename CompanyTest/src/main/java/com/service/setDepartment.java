package com.service;

import com.domain.department;

/**
 * Created by wxq on 17-8-20.
 */
public class setDepartment {
    public department setDept(int id){
        department dept = new department();
        dept.setId(id);
        switch(id){
            case 1 :   dept.setName("总裁");break;
            case 2 :   dept.setName("副总裁");break;
            case 3 :   dept.setName("秘书部");break;
            case 4 :   dept.setName("人事部");break;
            case 5 :   dept.setName("销售部");break;
            case 6 :   dept.setName("后勤部");break;
            case 7 :   dept.setName("业务部");break;
        }
        return dept;
    }
}
