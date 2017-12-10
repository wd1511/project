package papermanage.tourist;

import java.util.LinkedList;
import papermanage.ConnectMysql;
import papermanage.Reference;
import papermanage.Search;

public class ReferenceSearchByKeywords {
	private String referenceKeywords;
	private LinkedList<Reference> reference;
	static Search search=new Search();
	
    public String execute() {
       reference=search.searchByReferenceKeywords(referenceKeywords);
       return "success";
   }
   
   public void setReferenceKeywords(String referenceKeywords) {
       this.referenceKeywords=referenceKeywords;
   }
   public String getReferenceKeywords() {
	   return this.referenceKeywords;
   }
   
   public void setReference(LinkedList<Reference> reference) {
       this.reference=reference;
   }
   public LinkedList<Reference> getReference() {
	   return this.reference;
   }
}
