package papermanage.tourist;

import java.util.LinkedList;
import papermanage.ConnectMysql;
import papermanage.Reference;
import papermanage.Search;

public class ReferenceSearchByPublication {
	private String referencePublication;
	private LinkedList<Reference> reference;
	static Search search=new Search();
	
    public String execute() {
       reference=search.searchByReferencePublication(referencePublication);
       return "success";
   }
   
   public void setReferencePublication(String referencePublication) {
       this.referencePublication=referencePublication;
   }
   public String getReferencePublication() {
	   return this.referencePublication;
   }
   
   public void setReference(LinkedList<Reference> reference) {
       this.reference=reference;
   }
   public LinkedList<Reference> getReference() {
	   return this.reference;
   }
}
