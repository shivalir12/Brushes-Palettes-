package com.nc.dao;
import java.sql.*;
import com.nc.user.User;
public class UserDao{
	public User addNewUser(User u)
	{
		String sql="insert into user_details values(?,?,?,?,?,?,?)";
		try(Connection conn=ConnectionUtil.getConnection();
			PreparedStatement pst=conn.prepareStatement(sql);)
		{
		 u.setUserId(getNextUserId(conn));
		pst.setInt(1, u.getUserId());
		 pst.setString(2,u.getUser_email());
		 pst.setString(3,u.getFullname());
		 pst.setString(4,u.getCity_or_town());
		 pst.setInt(5,u.getMobile());
		 pst.setString(6,u.getPassword());
		 pst.setString(7,u.getFeedback());
		 pst.executeUpdate();
		 }catch(SQLException e)
		{
			 e.printStackTrace();
		}
		return u;
		}
private Integer getNextUserId(Connection conn)
{
	Integer nextId=null;
	String sql="selectmax(userId) from user_details";
	try
	{
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(sql);
		if(rs.next())
		{
			nextId=rs.getInt(1)+1;
		}
		else
		{
			nextId=1;
		}
	}catch(SQLException e)
	{
		e.printStackTrace();
	}
	return nextId;
}
public boolean validateUser(User u)
{
	String sql="select * from user_details where user_email=? and password=?";
	Boolean result=false;
	try(Connection conn=ConnectionUtil.getConnection();
		PreparedStatement pst=conn.prepareStatement(sql))
{
	pst.setString(1,u.getUser_email());
	pst.setString(2,u.getPassword());
	ResultSet rs=pst.executeQuery();
	if(rs.next())
	{
		result=true;
	}
}catch(SQLException e)
{
	e.printStackTrace();
}
return result;
	}
	}

