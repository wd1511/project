package papermanage.tourist;

import java.util.LinkedList;

import papermanage.ConnectMysql;

public class PaperSort3 {
  private String sort2;
  private LinkedList<String> paperSort3;
  static ConnectMysql connector=new ConnectMysql();
  public String execute() {
    paperSort3=connector.paperSort3(sort2);
    return "success";
  }
  
  public void setSort2(String sort2) {
    this.sort2=sort2;
  }
  public String getSort2() {
    return this.sort2;
  }
  
  public void setPaperSort3(LinkedList<String> paperSort3){
    this.paperSort3=paperSort3;
  }
  public LinkedList<String> getPaperSort3(){
    return this.paperSort3;
  }
}
