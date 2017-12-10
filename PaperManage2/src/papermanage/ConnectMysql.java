package papermanage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.LinkedList;
import java.sql.ResultSet;

public class ConnectMysql {
	private Connection conn;
	private Statement stmt;
	
	public ConnectMysql(){
		String username = "root";
		String password = "";
		String url="jdbc:mysql://localhost:3306/papermanage?useUnicode=true&characterEncoding=utf-8&useSSL=false";
		try{
		
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, username, password);
			stmt = conn.createStatement();
		}
		catch(Exception ex){
			System.out.println(ex);
			System.exit(0);
		}
	}
	
	//杩斿洖鏁版嵁搴撹繛鎺onn
	public Connection retConnect(){
		return conn;
	}
	
	//杩斿洖璁烘枃鐨勪竴绾у垎绫�
	public LinkedList<String> paperSort1(){
		LinkedList<String> a=new LinkedList<String>();
		try{
			stmt = conn.createStatement(); 
			String sql= "select * from paper_sort";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String s1=(String)rs.getString(2);
				if(!a.contains(s1))a.add(s1);
			}
			return a;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	//杩斿洖鍙傝�冩枃鐚殑涓�绾у垎绫�
	public LinkedList<String> referenceSort1(){
		LinkedList<String> a=new LinkedList<String>();
		try{
			stmt = conn.createStatement(); 
			String sql= "select * from reference_sort";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String s1=(String)rs.getString(2);
				if(!a.contains(s1))a.add(s1);
			}
			return a;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	//杩斿洖璁烘枃鐨勪簩绾у垎绫�
	public LinkedList<String> paperSort2(String sort1){
		LinkedList<String> a=new LinkedList<String>();
		try{
			stmt = conn.createStatement(); 
			String sql= "select * from paper_sort";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String s1=(String)rs.getString(2);
				String s2=(String)rs.getString(3);
				if((s1.equals(sort1)) &&(!a.contains(s2)))a.add(s2);
			}
			return a;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	//杩斿洖鍙傝�冩枃鐚殑浜岀骇鍒嗙被
	public LinkedList<String> referenceSort2(String sort1){
		LinkedList<String> a=new LinkedList<String>();
		try{
			stmt = conn.createStatement(); 
			String sql= "select * from reference_sort";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String s1=(String)rs.getString(2);
				String s2=(String)rs.getString(3);
				if((s1.equals(sort1)) &&(!a.contains(s2)))a.add(s2);
			}
			return a;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	//杩斿洖璁烘枃鐨勪笁绾у垎绫�
	public LinkedList<String> paperSort3(String sort2){
		LinkedList<String> a=new LinkedList<String>();
		try{
			stmt = conn.createStatement(); 
			String sql= "select * from paper_sort";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String s1=(String)rs.getString(3);
				String s2=(String)rs.getString(4);
				String[]t=s2.split(",");
				int i;
				for(i=0;i!=t.length;i++)if((s1.equals(sort2)) &&(!a.contains(t[i])))a.add(t[i]);
			}
			return a;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	//杩斿洖鍙傝�冩枃鐚殑涓夌骇鍒嗙被
	public LinkedList<String> referenceSort3(String sort2){
		LinkedList<String> a=new LinkedList<String>();
		try{
			stmt = conn.createStatement(); 
			String sql= "select * from reference_sort";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String s1=(String)rs.getString(3);
				String s2=(String)rs.getString(4);
				String[]t=s2.split(",");
				int i;
				for(i=0;i!=t.length;i++)if((s1.equals(sort2)) &&(!a.contains(t[i])))a.add(t[i]);
			}
			return a;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	//涓夌骇璁烘枃灞曠ず
	public LinkedList<Paper> paperShow(String sort3){
		LinkedList<Paper> a=new LinkedList<Paper>();
		try{
			stmt = conn.createStatement(); 
			String sql= "select * from paper";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String s1=(String)rs.getString(7);
				if(s1.equals(sort3)){
				Paper p=new Paper((int)rs.getInt(1),(String)rs.getString(2),(String)rs.getString(3),
				(String)rs.getString(4),(String)rs.getString(5),(String)rs.getString(6),(String)rs.getString(7),
				(String)rs.getString(8),(String)rs.getString(9),(String)rs.getString(10),(String)rs.getString(11),(int)rs.getInt(12),(String)rs.getString(13));
				a.add(p);
				}
			}
			return a;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	//涓夌骇鏂囩尞灞曠ず
	public LinkedList<Reference> referenceShow(String sort3){
		LinkedList<Reference> a=new LinkedList<Reference>();
		try{
			stmt = conn.createStatement(); 
			String sql= "select * from reference";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String s1=(String)rs.getString(7);
				if(s1.equals(sort3)){
				Reference p=new Reference((int)rs.getInt(1),(String)rs.getString(2),(String)rs.getString(3),
				(String)rs.getString(4),(String)rs.getString(5),(String)rs.getString(6),(String)rs.getString(7),
				(String)rs.getString(8),(String)rs.getString(9),(String)rs.getString(10));
				a.add(p);
				}
			}
			return a;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	//灞曠ず璁烘枃璇︾粏淇℃伅
	public Paper paperInformation(int id){
		Paper paper;
		try{
			stmt = conn.createStatement(); 
			String sql= "select * from paper where id = '"+id+"'";
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()){
				paper=new Paper((int)rs.getInt(1),(String)rs.getString(2),(String)rs.getString(3),
					(String)rs.getString(4),(String)rs.getString(5),(String)rs.getString(6),(String)rs.getString(7),
					(String)rs.getString(8),(String)rs.getString(9),(String)rs.getString(10),(String)rs.getString(11),(int)rs.getInt(12),(String)rs.getString(13));
				return paper;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	//灞曠ず鏂囩尞璇︾粏淇℃伅
	public Reference referenceInformation(int id){
		Reference reference;
		try{
			stmt = conn.createStatement(); 
			String sql= "select * from reference where id = '"+id+"'";
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()){
				reference=new Reference((int)rs.getInt(1),(String)rs.getString(2),(String)rs.getString(3),
					(String)rs.getString(4),(String)rs.getString(5),(String)rs.getString(6),(String)rs.getString(7),
					(String)rs.getString(8),(String)rs.getString(9),(String)rs.getString(10));
				return reference;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
}