package papermanage.user.search;

import java.util.LinkedList;
import papermanage.ConnectMysql;
import papermanage.Paper;
import papermanage.Reference;
import papermanage.Search;

public class Seek {
	private String searchWay;
	private String searchContent;
	private String searchSource;
	private LinkedList<Paper> paper;
	private LinkedList<Reference> reference;
	static Search search=new Search();
	
    public String execute() {
       //paper=search.searchByPaperAuthor(paperAuthor);
    	if(searchSource.equals("paper")){
    		if(searchWay.equals("byName")){
    			paper=search.searchByPaperName(searchContent);
        		return "PaperSuccess";
        	}
        	else if(searchWay.equals("byAuthor")){
        		paper=search.searchByPaperAuthor(searchContent);
        		return "PaperSuccess";
        	}
        	else if(searchWay.equals("byDate")){
        		paper=search.searchByPaperYear(searchContent);
        		return "PaperSuccess";
        	}
        	else if(searchWay.equals("byKeywords")){
        		paper=search.searchByPaperKeywords(searchContent);
        		return "PaperSuccess";
        	}
        	else if(searchWay.equals("byPublication")){
        		paper=search.searchByPaperPublication(searchContent);
        		return "PaperSuccess";
        	}
        	else if(searchWay.equals("byAuthorID")) {
        	  paper=search.searchByAuthorId(Integer.parseInt(searchContent));
        	  return "PaperSuccess";
        	}
        	else{
        		return "failure";
        	}
    	}
    	else if(searchSource.equals("reference")){
    		if(searchWay.equals("byName")){
    			reference=search.searchByReferenceName(searchContent);
        		return "ReferenceSuccess";
        	}
        	else if(searchWay.equals("byAuthor")){
        		reference=search.searchByReferenceAuthor(searchContent);
        		return "ReferenceSuccess";
        	}
        	else if(searchWay.equals("byDate")){
        		reference=search.searchByReferenceYear(searchContent);
        		return "ReferenceSuccess";
        	}
        	else if(searchWay.equals("byKeywords")){
        		reference=search.searchByReferenceKeywords(searchContent);
        		return "ReferenceSuccess";
        	}
        	else if(searchWay.equals("byPublication")){
        		reference=search.searchByReferencePublication(searchContent);
        		return "ReferenceSuccess";
        	}
        	else{
        		return "ReferenceFailure";
        	}
    	}
    	else{
    		return "failure";
    	}
    }
   
   public void setSearchWay(String searchWay) {
       this.searchWay=searchWay;
   }
   public String getSearchWay() {
	   return this.searchWay;
   }
   
   public void setSearchSource(String searchSource) {
       this.searchSource=searchSource;
   }
   public String getSearchSource() {
	   return this.searchSource;
   }
   
   public void setSearchContent(String searchContent) {
       this.searchContent=searchContent;
   }
   public String getSearchContent() {
	   return this.searchContent;
   }
   
   public void setPaper(LinkedList<Paper> paper) {
       this.paper=paper;
   }
   public LinkedList<Paper> getPaper() {
	   return this.paper;
   }
   
   public void setReference(LinkedList<Reference> reference) {
       this.reference=reference;
   }
   public LinkedList<Reference> getReference() {
	   return this.reference;
   }
}
