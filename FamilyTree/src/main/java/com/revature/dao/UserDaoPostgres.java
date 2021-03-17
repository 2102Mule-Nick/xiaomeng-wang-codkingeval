package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.revature.pojo.User;
import com.revature.util.ConnectionFactoryPostgres;

public class UserDaoPostgres implements UserDao{
	
	String INSERT_SMT = "insert into user_familytree (username, fathername, mothername) values (?, ? ,?)";

	public void createUser(User user) {
		try {
		Connection conn = ConnectionFactoryPostgres.getConnection();
		
		PreparedStatement pstmt = conn.prepareStatement(INSERT_SMT, Statement.RETURN_GENERATED_KEYS);
		pstmt.setString(1, user.getUsername()); 
		pstmt.setString(2, user.getFathername());
		pstmt.setString(2, user.getMothername());
		
		pstmt.executeUpdate(); 
		  
		  //grab generated cart_id
		  ResultSet rs = pstmt.getGeneratedKeys();
		  rs.next();
		  user.setId((int)rs.getLong(1));
		} catch(SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public void removeUser(User user) {
		// TODO Auto-generated method stub
		
	}

}
