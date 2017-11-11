package papermanage.tourist;

import java.util.LinkedList;
import papermanage.ConnectMysql;
import papermanage.Paper;
import papermanage.Search;

public class PaperSearchByPublication {
	private String paperPublication;
	private LinkedList<Paper> paper;
	static Search search=new Search();
	
    public String execute() {
       paper=search.searchByPaperPublication(paperPublication);
       return "success";
   }
   
   public void setPaperPublication(String paperPublication) {
       this.paperPublication=paperPublication;
   }
   public String getPaperPublication() {
	   return this.paperPublication;
   }
   
   public void setPaper(LinkedList<Paper> paper) {
       this.paper=paper;
   }
   public LinkedList<Paper> getPaper() {
	   return this.paper;
   }
}
