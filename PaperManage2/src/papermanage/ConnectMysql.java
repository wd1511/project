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
		String password = "DAMNyou321";
		String url="jdbc:mysql://localhost:3306/PaperDB?useUnicode=true&characterEncoding=utf-8&useSSL=false";
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
			String sql= "select * from paper";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String s1=(String)rs.getString(5);
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
			String sql= "select * from reference";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String s1=(String)rs.getString(5);
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
			String sql= "select * from paper";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String s1=(String)rs.getString(5);
				String s2=(String)rs.getString(6);
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
			String sql= "select * from reference";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String s1=(String)rs.getString(5);
				String s2=(String)rs.getString(6);
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
			String sql= "select * from paper";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String s1=(String)rs.getString(6);
				String s2=(String)rs.getString(7);
				if((s1.equals(sort2)) &&(!a.contains(s2)))a.add(s2);
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
			String sql= "select * from reference";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String s1=(String)rs.getString(6);
				String s2=(String)rs.getString(7);
				if((s1.equals(sort2)) &&(!a.contains(s2)))a.add(s2);
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
				(String)rs.getString(8),(String)rs.getString(9),(String)rs.getString(10),(String)rs.getString(11));
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

	public boolean addPaper(Paper newPaper){
		try{
			stmt = conn.createStatement(); 
			String sql= "insert into paper values('"+newPaper.getId()+"','"+newPaper.getPaperName()+"','"+newPaper.getAuthor()
					+"','"+newPaper.getKeywords()+"','"+newPaper.getSort1()+"','"+newPaper.getSort2()+"','"+newPaper.getSort3()
					+"','"+newPaper.getPublication()+"','"+newPaper.getWorkload()+"','"+newPaper.getDate()+"','"+newPaper.getReference()+"')";
			stmt.executeUpdate(sql);
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean addReference(Reference newReference){
		try{
			stmt = conn.createStatement(); 
			String sql= "insert into reference values('"+newReference.getId()+"','"+newReference.getReferenceName()+"','"+newReference.getAuthor()
					+"','"+newReference.getKeywords()+"','"+newReference.getSort1()+"','"+newReference.getSort2()+"','"+newReference.getSort3()
					+"','"+newReference.getPublication()+"','"+newReference.getWorkload()+"','"+newReference.getDate()+"')";
			stmt.executeUpdate(sql);
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean deletePaper(int id)
	{
		try{
			stmt = conn.createStatement(); 
			String sql= "delete from paper where id='"+id+"'";
			stmt.executeUpdate(sql);
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean deleteReference(int id)
	{
		try{
			stmt = conn.createStatement(); 
			String sql= "delete from reference where id='"+id+"'";
			stmt.executeUpdate(sql);
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
}