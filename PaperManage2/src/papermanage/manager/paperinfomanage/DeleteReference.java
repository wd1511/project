package papermanage.manager.paperinfomanage;

import papermanage.Reference;
import papermanage.Manager;

public class DeleteReference {
	private Reference reference;
	private Manager manager=new Manager();
	
	public String execute(){
		manager.deleteReference(reference.getId());		
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
