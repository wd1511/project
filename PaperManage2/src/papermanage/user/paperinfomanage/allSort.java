package papermanage.user.paperinfomanage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.LinkedList;

import papermanage.ConnectMysql;

import java.sql.ResultSet;

public class allSort {
	private LinkedList<LinkedList<String>> list1=new LinkedList<LinkedList<String>>();
	
	public LinkedList<LinkedList<String>> getList1(){
		return this.list1;
	}
	
	public String execute(){
		ConnectMysql c=new ConnectMysql();
		LinkedList<String> s1=c.paperSort1();
		for(int i=0;i<s1.size();i++){
			LinkedList<String> s2=c.paperSort2(s1.get(i));
			for(int j=0;j<s2.size();j++){
				LinkedList<String> s3=c.paperSort3(s2.get(j));
				
				LinkedList<String> tmp=new LinkedList<String>();
				for(int k=0;k<2+s3.size();k++){
					if(k==0) tmp.add(s1.get(i));
					else if(k==1)tmp.add( s2.get(j));
					else tmp.add(s3.get(k-2));
				}
				list1.add(tmp);
			}
		}
		return "success";
	}
}
