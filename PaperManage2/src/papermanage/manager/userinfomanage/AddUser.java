package papermanage.manager.userinfomanage;

import papermanage.User;
import papermanage.Manager;

public class AddUser {
	private User newUser;
	private Manager manager;
	
	public String execute(){
		manager.addUser(newUser.getId(),newUser.getUsername(),newUser.getAuthorName(),newUser.getPassword());		
		return "success";
	}
	
	public void setNewUser(User newUser) {
       this.newUser=newUser;
   }
   public User getNewUser() {
	   return this.newUser;
   }
   
   public void setManager(Manager manager) {
       this.manager=manager;
   }
   public Manager getManager() {
	   return this.manager;
   }
}
