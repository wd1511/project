package papermanage.user.paperinfomanage;

import papermanage.Paper;
import papermanage.Manager;

public class ModifyPaper {
	private Paper newPaper;
	private Manager manager=new Manager();
	
	public String execute(){
		manager.modifyPaper(newPaper);		
		return "success";
	}
	
	public void setNewPaper(Paper newPaper) {
       this.newPaper=newPaper;
   }
   public Paper getNewPaper() {
	   return this.newPaper;
   }
   
   public void setManager(Manager manager) {
       this.manager=manager;
   }
   public Manager getManager() {
	   return this.manager;
   }
}
