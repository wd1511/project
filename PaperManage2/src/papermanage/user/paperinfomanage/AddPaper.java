package papermanage.user.paperinfomanage;

import papermanage.Paper;

import java.util.List;

import papermanage.Manager;

public class AddPaper {
	private Paper newPaper;
	private Manager manager=new Manager();
	int flag;
	public String execute(){
		if(flag==0)
		{
			manager.addPaper(newPaper);	
		}
		else
		{
			manager.addOtherPaper(newPaper);
		}
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
   public void setFlag(int flag) {
     this.flag=flag;
   }
   public int getFlag() {
     return this.flag;
   }

}

