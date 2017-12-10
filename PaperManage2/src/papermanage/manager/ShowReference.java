package papermanage.manager;

import papermanage.Reference;
import papermanage.Manager;
import papermanage.ConnectMysql;

public class ShowReference {
	private Reference reference;
	private Manager manager;
	
	public String execute(){
		ConnectMysql connect=new ConnectMysql();
		connect.referenceInformation(reference.getId());		
		return "success";
	}
	
	public void setReference(Reference reference) {
       this.reference=reference;
   }
   public Reference getReference() {
	   return this.reference;
   }
   
   public void setManager(Manager manager) {
       this.manager=manager;
   }
   public Manager getManager() {
	   return this.manager;
   }
}
