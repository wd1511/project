package papermanage.manager.paperinfomanage;

import papermanage.Paper;

import java.util.List;

import papermanage.Manager;

public class AddPaper {
	private Paper newPaper;
	private Manager manager=new Manager();
	public String execute(){
		manager.addPaper(newPaper);		
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

