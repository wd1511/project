package papermanage;

import java.sql.*;
import java.util.*;

public class Manager extends Tourist {
	//添加用户
	public void addUser(int id,String name,String password){
		ConnectMysql c=new ConnectMysql();
		Connection conn=c.retConnect();
		Statement stmt;
		try{
			stmt = conn.createStatement(); 
			String sql= "insert into user values('"+id+"','"+name+"','"+password+"')";
			stmt.executeUpdate(sql);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	//删除用户
	public boolean deleteUser(int id){
		ConnectMysql c=new ConnectMysql();
		Connection conn=c.retConnect();
		Statement stmt;
		try{
			stmt = conn.createStatement(); 
			String sql= "delete from user where id='"+id+"'";
			stmt.executeUpdate(sql);
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	//展示用户信息
	public User showUser(int id){
		ConnectMysql c=new ConnectMysql();
		Connection conn=c.retConnect();
		Statement stmt;
		try{
			stmt = conn.createStatement(); 
			String sql= "select * from user where id = '"+id+"'";
			ResultSet rs=stmt.executeQuery(sql);
			User u=new User();
			while(rs.next()){
				u.setId((int)rs.getInt(1));
				u.setUsername((String)rs.getString(2));
				u.setPassword((String)rs.getString(3));
			}
			return u;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
