package papermanage.manager;

import papermanage.User;
import papermanage.Manager;

public class ShowUser {
	private User user;
	private Manager manager;
	
	public String execute(){
		manager.showUser(user.getId());		
		return "success";
	}
	
	public void setUser(User user) {
       this.user=user;
   }
   public User getUser() {
	   return this.user;
   }
   
   public void setManager(Manager manager) {
       this.manager=manager;
   }
   public Manager getManager() {
	   return this.manager;
   }
}
