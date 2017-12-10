package manager;

import papermanage.User;
import papermanage.Manager;

public class ModifyUser {
	private User newUser;
	private Manager manager;
	
	public String execute(){
		manager.modifyUser(newUser);		
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
