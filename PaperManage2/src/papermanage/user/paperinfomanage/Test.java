package papermanage.user.paperinfomanage;

import java.util.LinkedList;
import java.util.List;

public class Test {
  List<List<Integer>> list1=new LinkedList<List<Integer>>();;
  public String execute() {
   List<Integer> temp=new LinkedList<Integer>();
   temp.add(1);
   for(int i=11;i!=20;i++)
     temp.add(i);
   list1.add(temp);
   
   List<Integer> temp2=new LinkedList<Integer>();
   temp2.add(2);
   for(Integer i=21;i!=30;i++)
     temp2.add(i);
   list1.add(temp2);
   
    return "success";
  }
  
  public List<List<Integer>> getList1(){
    return this.list1;
  }
  public void setList1(List<List<Integer>>list1) {
    this.list1=list1;
  }
}
