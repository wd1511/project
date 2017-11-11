package papermanage.tourist;

import java.util.LinkedList;
import papermanage.ConnectMysql;
import papermanage.Reference;
import papermanage.Search;

public class ReferenceSearchByDate {
	private String referenceDate;
	private LinkedList<Reference> reference;
	static Search search=new Search();
	
    public String execute() {
       reference=search.searchByReferenceYear(referenceDate);
       return "success";
   }
   
   public void setReferenceDate(String referenceDate) {
       this.referenceDate=referenceDate;
   }
   public String getReferenceDate() {
	   return this.referenceDate;
   }
   
   public void setReference(LinkedList<Reference> reference) {
       this.reference=reference;
   }
   public LinkedList<Reference> getReference() {
	   return this.reference;
   }
}
