package papermanage.manager.paperinfomanage;

import papermanage.Paper;
import papermanage.Manager;

public class DeletePaper {
	private Paper paper;
	private Manager manager=new Manager();
	
	public void execute(){
		manager.deletePaper(paper.getId());		
	}
	
	public void setPaper(Paper paper) {
       this.paper=paper;
   }
   public Paper getPaper() {
	   return this.paper;
   }
   
   public void setManager(Manager manager) {
       this.manager=manager;
   }
   public Manager getManager() {
	   return this.manager;
   }
}
