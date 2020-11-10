package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cybage.model.Sport;

public class CustomerDao
{
	

	public List<Sport> getSports() throws Exception {
		System.out.println("in cust dao");
		String sql = "select * from sport";
		Connection connection = DbUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		List<Sport> sport = new ArrayList<Sport>();
		while(rs.next()) {
			sport.add(new Sport(rs.getString("sName")));
			
		}
		return sport;
	}
}
