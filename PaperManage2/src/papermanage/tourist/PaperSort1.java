package papermanage.tourist;

import java.util.LinkedList;

import papermanage.ConnectMysql;

public class PaperSort1 {
  static ConnectMysql connector=new ConnectMysql();
  private LinkedList<String> paperSort1;
  public String execute() {
    paperSort1=connector.paperSort1();
    return "success";
  }
  
  public void setPaperSort1(LinkedList<String> paperSort1) {
    this.paperSort1=paperSort1;
  }
  
  public LinkedList<String> getPaperSort1(){
    return this.paperSort1;
  }
}
