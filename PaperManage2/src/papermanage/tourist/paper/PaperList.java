package papermanage.tourist.paper;

import java.util.LinkedList;
import papermanage.ConnectMysql;
import papermanage.Paper;

public class PaperList {
  private String sort1;
  private String sort2;
	private String sort3;
	private LinkedList<Paper> paper;
	static ConnectMysql connector=new ConnectMysql();
	
	public String execute() {
		paper=connector.paperShow(sort3);
		return "success";
	}
	
	public void setSort1(String sort1) {
	  this.sort1=sort1;
	}
	public String getSort1() {
	  return this.sort1;
	}
	public void setSort2(String sort2) {
	  this.sort2=sort2;
	}
	public String getSort2() {
	  return this.sort2;
	}
	
	public void setSort3(String sort3) {
	    this.sort3=sort3;
	}
	
	public String getSort3() {
	    return this.sort3;
	}
	
	public void setPaper(LinkedList<Paper> paper) {
	    this.paper=paper;
	}
	public LinkedList<Paper> getPaper() {
	    return this.paper;
	}
}
