package papermanage.tourist;

import java.util.LinkedList;

import papermanage.ConnectMysql;

public class ReferenceSort2 {
  private String sort1;
  private LinkedList<String> referenceSort2;
  static ConnectMysql connector=new ConnectMysql();
  public String execute() {
    referenceSort2=connector.referenceSort2(sort1);
    return "success";
  }
  
  public void setSort1(String sort1) {
    this.sort1=sort1;
  }
  public String getSort1() {
    return this.sort1;
  }
  
  public void setreferenceSort2(LinkedList<String> referenceSort2){
    this.referenceSort2=referenceSort2;
  }
  public LinkedList<String> getreferenceSort2(){
    return this.referenceSort2;
  }
}
