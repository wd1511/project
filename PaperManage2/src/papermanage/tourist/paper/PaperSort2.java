package papermanage.tourist.paper;

import java.util.LinkedList;

import papermanage.ConnectMysql;

public class PaperSort2 {
  private String sort1;
  private LinkedList<String> paperSort2;
  static ConnectMysql connector=new ConnectMysql();
  public String execute() {
    paperSort2=connector.paperSort2(sort1);
    return "success";
  }
  
  public void setSort1(String sort1) {
    this.sort1=sort1;
  }
  public String getSort1() {
    return this.sort1;
  }
  
  public void setPaperSort2(LinkedList<String> paperSort2){
    this.paperSort2=paperSort2;
  }
  public LinkedList<String> getPaperSort2(){
    return this.paperSort2;
  }
}
