package papermanage.manager.paperinfomanage;

import papermanage.Paper;

import java.util.List;

import papermanage.Manager;

public class SolveOtherPaper {
	private Paper newPaper;
	private Manager manager=new Manager();
	int flag;
	public String execute(){
		manager.addPaper(newPaper);	
		if(flag==1)
		{
			manager.addSort(newPaper.getSort1(), newPaper.getSort2(), newPaper.getSort3());
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
