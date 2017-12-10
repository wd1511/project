package papermanage.tourist;

import java.util.LinkedList;
import papermanage.ConnectMysql;
import papermanage.Reference;
import papermanage.Search;

public class ReferenceSearchByAuthor {
	private String referenceAuthor;
	private LinkedList<Reference> reference;
	static Search search=new Search();
	
    public String execute() {
       reference=search.searchByReferenceAuthor(referenceAuthor);
       return "success";
   }
   
   public void setReferenceAuthor(String referenceAuthor) {
       this.referenceAuthor=referenceAuthor;
   }
   public String getReferenceAuthor() {
	   return this.referenceAuthor;
   }
   
   public void setReference(LinkedList<Reference> reference) {
       this.reference=reference;
   }
   public LinkedList<Reference> getReference() {
	   return this.reference;
   }
}
