package papermanage.tourist;

import papermanage.ConnectMysql;
import papermanage.User;
import java.sql.*;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport{
	private String username;
	private String password;
	private String identity;
	private User user;
	ConnectMysql connector=new ConnectMysql();
	Statement stmt;
	
	public String execute() {
       if(identity.equals("manager")){
       		if(username.equals("pangdaye") && password.equals("123456")){return "managerSuccess";}
       }
       else{
	       	try{
	       		Connection conn=connector.retConnect();
				stmt = conn.createStatement(); 
				String sql= "select * from user where username = '"+username+"' and password = '"+password+"'";
				ResultSet rs = stmt.executeQuery(sql);
				if(rs.next()){
				user=new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
				ActionContext.getContext().getSession().put("user", user);
				return "userSuccess";
				}
			  }
			   catch(Exception e){
				  e.printStackTrace();
			}
       }
       return "false";
   }
   
   public void setUsername(String username) {
       this.username=username;
   }
   public String getUsername() {
	   return this.username;
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
   public void setIdentity(String identity) {
     this.identity=identity;
   }
   public String getIdentity() {
     return this.identity;
  }
}


