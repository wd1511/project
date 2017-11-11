package papermanage.tourist;

import java.util.LinkedList;
import papermanage.ConnectMysql;
import papermanage.Paper;
import papermanage.Search;

public class PaperSearchByName {
	private String paperName;
	private LinkedList<Paper> paper;
	static Search search=new Search();
	
    public String execute() {
       paper=search.searchByPaperName(paperName);
       return "success";
   }
   
   public void setPaperName(String paperName) {
       this.paperName=paperName;
   }
   public String getPaperName() {
	   return this.paperName;
   }
   
   public void setPaper(LinkedList<Paper> paper) {
       this.paper=paper;
   }
   public LinkedList<Paper> getPaper() {
	   return this.paper;
   }
}
