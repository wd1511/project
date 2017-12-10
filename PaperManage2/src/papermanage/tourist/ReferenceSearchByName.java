package papermanage.tourist;

import java.util.LinkedList;
import papermanage.ConnectMysql;
import papermanage.Reference;
import papermanage.Search;

public class ReferenceSearchByName {
	private String referenceName;
	private LinkedList<Reference> reference;
	static Search search=new Search();
	
    public String execute() {
       reference=search.searchByReferenceName(referenceName);
       return "success";
   }
   
   public void setReferenceName(String referenceName) {
       this.referenceName=referenceName;
   }
   public String getReferenceName() {
	   return this.referenceName;
   }
   
   public void setReference(LinkedList<Reference> reference) {
       this.reference=reference;
   }
   public LinkedList<Reference> getReference() {
	   return this.reference;
   }
}
