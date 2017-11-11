package papermanage.tourist;

import java.util.LinkedList;
import papermanage.ConnectMysql;
import papermanage.Paper;
import papermanage.Search;

public class PaperSearchByAuthor {
	private String paperAuthor;
	private LinkedList<Paper> paper;
	static Search search=new Search();
	
    public String execute() {
       paper=search.searchByPaperAuthor(paperAuthor);
       return "success";
   }
   
   public void setPaperAuthor(String paperAuthor) {
       this.paperAuthor=paperAuthor;
   }
   public String getPaperAuthor() {
	   return this.paperAuthor;
   }
   
   public void setPaper(LinkedList<Paper> paper) {
       this.paper=paper;
   }
   public LinkedList<Paper> getPaper() {
	   return this.paper;
   }
}
