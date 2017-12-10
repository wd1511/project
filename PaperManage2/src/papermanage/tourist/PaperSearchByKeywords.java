package papermanage.tourist;

import java.util.LinkedList;
import papermanage.ConnectMysql;
import papermanage.Paper;
import papermanage.Search;

public class PaperSearchByKeywords {
	private String paperKeywords;
	private LinkedList<Paper> paper;
	static Search search=new Search();
	
    public String execute() {
       paper=search.searchByPaperKeywords(paperKeywords);
       return "success";
   }
   
   public void setPaperKeywords(String paperKeywords) {
       this.paperKeywords=paperKeywords;
   }
   public String getPaperKeywords() {
	   return this.paperKeywords;
   }
   
   public void setPaper(LinkedList<Paper> paper) {
       this.paper=paper;
   }
   public LinkedList<Paper> getPaper() {
	   return this.paper;
   }
}
