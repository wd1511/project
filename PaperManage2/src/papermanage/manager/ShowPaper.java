package papermanage.manager;

import papermanage.Paper;
import papermanage.Manager;
import papermanage.ConnectMysql;

public class ShowPaper {
	private Paper paper;
	private Manager manager;
	
	public String execute(){
		ConnectMysql connect=new ConnectMysql();
		connect.paperInformation(paper.getId());		
		return "success";
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
