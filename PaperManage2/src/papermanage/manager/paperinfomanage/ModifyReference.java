package papermanage.manager.paperinfomanage;

import papermanage.Reference;
import papermanage.Manager;

public class ModifyReference {
	private Reference newReference;
	private Manager manager=new Manager();
	
	public String execute(){
		manager.modifyReference(newReference);		
		return "success";
	}
	
	public void setNewReference(Reference newReference) {
       this.newReference=newReference;
   }
   public Reference getNewReference() {
	   return this.newReference;
   }
   
   public void setManager(Manager manager) {
       this.manager=manager;
   }
   public Manager getManager() {
	   return this.manager;
   }
}
