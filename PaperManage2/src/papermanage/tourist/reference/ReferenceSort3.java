package papermanage.tourist.reference;

import java.util.LinkedList;

import papermanage.ConnectMysql;

public class ReferenceSort3 {
  private String sort2;
  private LinkedList<String> referenceSort3;
  static ConnectMysql connector=new ConnectMysql();
  public String execute() {
    referenceSort3=connector.referenceSort3(sort2);
    return "success";
  }
  
  public void setSort2(String sort2) {
    this.sort2=sort2;
  }
  public String getSort2() {
    return this.sort2;
  }
  
  public void setReferenceSort3(LinkedList<String> referenceSort3){
    this.referenceSort3=referenceSort3;
  }
  public LinkedList<String> getReferenceSort3(){
    return this.referenceSort3;
  }
}
