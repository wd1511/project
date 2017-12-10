package papermanage.manager.reference;

import java.util.LinkedList;

import papermanage.ConnectMysql;

public class ReferenceSort1 {
  static ConnectMysql connector=new ConnectMysql();
  private LinkedList<String> referenceSort1;
  public String execute() {
    referenceSort1=connector.referenceSort1();
    return "success";
  }
  
  public void setReferenceSort1(LinkedList<String> referenceSort1) {
    this.referenceSort1=referenceSort1;
  }
  
  public LinkedList<String> getReferenceSort1(){
    return this.referenceSort1;
  }
}
