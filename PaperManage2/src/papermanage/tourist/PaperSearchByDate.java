package papermanage.tourist;

import java.util.LinkedList;
import papermanage.ConnectMysql;
import papermanage.Paper;
import papermanage.Search;

public class PaperSearchByDate {
	private String paperDate;
	private LinkedList<Paper> paper;
	static Search search=new Search();
	
    public String execute() {
       paper=search.searchByPaperYear(paperDate);
       return "success";
   }
   
   public void setPaperDate(String paperDate) {
       this.paperDate=paperDate;
   }
   public String getPaperDate() {
	   return this.paperDate;
   }
   
   public void setPaper(LinkedList<Paper> paper) {
       this.paper=paper;
   }
   public LinkedList<Paper> getPaper() {
	   return this.paper;
   }
}
