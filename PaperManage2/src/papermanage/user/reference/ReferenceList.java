package papermanage.user.reference;

import java.util.LinkedList;
import papermanage.ConnectMysql;
import papermanage.Reference;

public class ReferenceList {
	private String sort3;
	private LinkedList<Reference> reference;
	static ConnectMysql connector=new ConnectMysql();
	
	public String execute(){
		reference=connector.referenceShow(sort3);
		return "success";
	}
	
	public void setSort3(String sort3) {
	    this.sort3=sort3;
	}
	
	public String getSort3() {
	    return this.sort3;
	}
	
	public void setReference(LinkedList<Reference> reference) {
	    this.reference=reference;
	}
	public LinkedList<Reference> getReference() {
	    return this.reference;
	}
}
