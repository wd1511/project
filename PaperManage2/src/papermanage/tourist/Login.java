package papermanage.tourist;

import papermanage.ConnectMysql;
import papermanage.User;
import java.sql.*;

public class Login {
	private String name;
	private String password;
	private String identity;
	private User user;
	ConnectMysql connector=new ConnectMysql();
	Statement stmt;
	
	public String execute() {
       if(identity.equals("manager")){
       		if(name.equals("pangdaye") && password.equals("123456")){return "managerSuccess";}
       }
       else{
	       	try{
	       		Connection conn=connector.retConnect();
				stmt = conn.createStatement(); 
				String sql= "select * from user where userName = '"+name+"' and password = '"+password+"'";
				ResultSet rs = stmt.executeQuery(sql);
				if(rs!=null){
				user=new User(rs.getInt(1),rs.getString(2),rs.getString(3));
				return "userSuccess";
				}
			  }
			   catch(Exception e){
				  e.printStackTrace();
			}
       }
       return "false";
   }
   
   public void setName(String name) {
       this.name=name;
   }
   public String getName() {
	   return this.name;
   }
   
   public void setPassword(String password) {
       this.password=password;
   }
   public String getPassword() {
	   return this.password;
   }
   
   public void setUser(User user) {
       this.user=user;
   }
   public User getUser() {
	   return this.user;
   }
}
