package com.makun.javase.studentmanage.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.makun.javase.studentmanage.common.SqlHelper;
import com.makun.javase.studentmanage.model.Admin;

public class AdminDao {
	private Connection conn;
	public AdminDao() throws ClassNotFoundException, SQLException, IOException{
		conn=SqlHelper.getConn();
	}
	//ɾ��
	public void del(String adminId) throws SQLException{
		String sql="delete from admin where adminId=?";
		PreparedStatement pstate=conn.prepareStatement(sql);
		pstate.setString(1, adminId);
		pstate.executeUpdate();
	}
	//�޸
	public void update(Admin admin) throws SQLException{
		String sql="update admin set adminPwd=? where adminId=?";
		PreparedStatement pState=conn.prepareStatement(sql);
		pState.setString(1, admin.getAdminPwd());
		pState.setString(2, admin.getAdminId());
		pState.executeUpdate();
	}
	// 通过主键查找
	public Admin findById(String adminId) throws SQLException{
		String sql="select * from admin where adminId=?";
		PreparedStatement pState=conn.prepareStatement(sql);
		pState.setString(1,adminId);
		ResultSet rs=pState.executeQuery();
		Admin admin=null;
		if(rs.next()){
			admin=new Admin();
			admin.setAdminId(rs.getString("adminId"));
			admin.setAdminPwd(rs.getString("adminPwd"));
		}
		return admin;
	}
	//
	public List<Admin> findAll() throws SQLException{
		String sql="select * from admin";
		List<Admin> list=new ArrayList<Admin>();
		Statement state=conn.createStatement();
		ResultSet rs=state.executeQuery(sql);
		while(rs.next()){
			Admin admin=new Admin();
			admin.setAdminId(rs.getString("adminId"));
			admin.setAdminPwd(rs.getString("adminPwd"));
			list.add(admin);
		}
		return list;
	}
}
