package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Service;

import com.domain.Product;

@Service
public class jdbc implements jdbcImplement {
	public jdbc(){
		
	}
	
	@Override
	public void test(Product product) {
		String driver = "com.mysql.jdbc.Driver";
		String user = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/test";
      // System.out.println("aaaa");
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, password);
			String sql = "insert product(name,description,price) values(?,?,?)";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, product.getName());
			statement.setString(2, product.getDescription());
			statement.setFloat(3,product.getPrice());
			statement.executeUpdate();
			statement.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
