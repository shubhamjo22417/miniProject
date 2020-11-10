package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cybage.model.Users;

public class AdminDao {

	public List<Users> getUsers() throws Exception{
		String sql = "select * from user";
		Connection connection = DbUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		List<Users> user = new ArrayList<Users>();
		while(rs.next()) {
			user.add(new Users(rs.getString("uName"), rs.getString("uRole")));
		}
		return user;
	}

	public int addUser(Users user) throws Exception {
		String sql = "insert into user(uName,uPassword,uRole,uEmail,uNumber) values(?, ?, ?,?,?)";
		Connection connection = DbUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);
	
		ps.setString(1, user.getuName());
		ps.setString(2, user.getuPassword());
		ps.setString(3, user.getuRole());
		ps.setString(4, user.getuEmail());
		ps.setString(5, user.getuNumber());
		return ps.executeUpdate();
	}

	public int deleteUser(String username) throws Exception{
		String sql = "delete from user where uName = ?";
		Connection connection = DbUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);		
		ps.setString(1, username);			
		return ps.executeUpdate();
	}

	public Users getUser(String username) throws Exception{
		String sql = "select * from user where uName = ?";
		Connection connection = DbUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, username);
		ResultSet rs = ps.executeQuery();
		Users  user = null;
		if(rs.next()) {
			user = new Users(rs.getString("uName"), rs.getString("uRole"));
		}
		return user;
	}

	public int updateUser(Users user)  throws Exception{
		String sql = "update user set uPassword = ? , uRole = ? where uName = ?";
		Connection connection = DbUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);		
		
		ps.setString(1, user.getuPassword());
		ps.setString(2, user.getuRole());
		ps.setString(3, user.getuName());
		return ps.executeUpdate();
	}

}
