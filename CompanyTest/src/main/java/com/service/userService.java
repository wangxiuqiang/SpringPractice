package com.service;

import com.domain.admin;

import com.domain.staff;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * 用来写那个数据库的操作
 */
public class userService {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {

        this.jdbcTemplate = jdbcTemplate;
    }

    /*
      用户登录的信息验证
     */
    public admin adminJoin() {

        String Querysql = "select * from admin";
        try {
            admin admin = jdbcTemplate.queryForObject(Querysql,new MyRowMapper());

            if (admin != null) {

                return admin;
            } else {
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 添加员工的jdbc操作
     */

    public int addStaff(staff staff, int DeptId){
        String addSql;
        int i = 0;
        if(DeptId == 1){
            addSql ="insert into presidentStaff(id,name,tel,money) values("+staff.getId()
                    + ",' " + staff.getName() +" ', '" + staff.getTel()+"', " + staff.getMoney()+")";
        }
        else if (DeptId == 2){
            addSql ="insert into vicePresidentStaff(id,name,tel,money) values("+staff.getId()
                    + ",' " + staff.getName() +" ', '" + staff.getTel()+"', " + staff.getMoney()+")";
        }else if(DeptId == 3){
            addSql ="insert into secretaryStaff(id,name,tel,money) values("+staff.getId()
                    + ",' " + staff.getName() +" ', '" + staff.getTel()+"', " + staff.getMoney()+")";
        }
        else if(DeptId == 4){
            addSql ="insert into personStaff(id,name,tel,money) values("+staff.getId()
                    + ",' " + staff.getName() +" ', '" + staff.getTel()+"', " + staff.getMoney()+")";
        }else if(DeptId == 5){
            addSql ="insert into saleStaff(id,name,tel,money) values("+staff.getId()
                    + ",' " + staff.getName() +" ', '" + staff.getTel()+"', " + staff.getMoney()+")";
        }
        else if(DeptId == 6){
            addSql ="insert into logisticStaff(id,name,tel,money) values("+staff.getId()
                    + ",' " + staff.getName() +" ', '" + staff.getTel()+"', " + staff.getMoney()+")";
        }else{
            addSql ="insert into businessStaff(id,name,tel,money) values("+staff.getId()
                    + ",' " + staff.getName() +" ', '" + staff.getTel()+"', " + staff.getMoney()+")";
        }
         i = jdbcTemplate.update(addSql);
         return i;
    }

    /**
     * 删除某一个的值
     */
    public int deleteStaff(int DeptId , int deleteId){

        String deleteSql;
        int i = 0;
        if(DeptId == 1){
            deleteSql ="DELETE FROM presidentStaff WHERE id = " + deleteId;
        }
        else if (DeptId == 2){
            deleteSql ="DELETE FROM vicePresidentStaff WHERE id = " + deleteId;
        }else if(DeptId == 3){
            deleteSql ="DELETE FROM secretaryStaff WHERE id = " + deleteId;
        }
        else if(DeptId == 4){
            deleteSql ="DELETE FROM personStaff WHERE id = " + deleteId;
        }else if(DeptId == 5){
            deleteSql ="DELETE FROM saleStaff WHERE id = " + deleteId;
        }
        else if(DeptId == 6){
            deleteSql ="DELETE FROM logisitcStaff WHERE id = " + deleteId;
        }else{
            deleteSql ="DELETE FROM businessStaff WHERE id = " + deleteId;
        }
        i = jdbcTemplate.update(deleteSql);
        return i;
    }
}


class MyRowMapper implements RowMapper<admin> {
     public admin mapRow(ResultSet rs, int n) throws SQLException {
         String name =	rs.getString("name");
         String password = rs.getString("password");

         admin admin = new admin();
         admin.setName(name);
         admin.setPassword(password);
         return admin;
     }
}
