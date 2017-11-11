package papermanage;

import java.sql.*;
import java.util.*;

public class Search {
	ConnectMysql c=new ConnectMysql();
	Connection conn=c.retConnect();
	Statement stmt;
	
	//根据论文名称搜索
	public LinkedList<Paper> searchByPaperName(String paperName){
		try{
			LinkedList<Paper>a=new LinkedList();
			stmt = conn.createStatement(); 
			String sql= "select * from paper where paperName = '"+paperName+"'";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				Paper p=new Paper((int)rs.getInt(1),(String)rs.getString(2),(String)rs.getString(3),
				(String)rs.getString(4),(String)rs.getString(5),(String)rs.getString(6),(String)rs.getString(7),
				(String)rs.getString(8),(String)rs.getString(9),(String)rs.getString(10),(String)rs.getString(11));
				a.add(p);
			}
			return a;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	//根据论文作者搜索
	public LinkedList<Paper> searchByPaperAuthor(String authorName){
		try{
			LinkedList<Paper>a=new LinkedList();
			stmt = conn.createStatement(); 
			String sql= "select * from paper";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String author=(String)rs.getString(3);
				String[] au=author.split(";");
				List<String> list=Arrays.asList(au);
				if(list.contains(authorName)){
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
	
	//根据关键词搜索
	public LinkedList<Paper> searchByPaperKeywords(String keywords){
		try{
			LinkedList<Paper>a=new LinkedList();
			stmt = conn.createStatement(); 
			String sql= "select * from paper";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String mykeywords=(String)rs.getString(4);
				String[] key=mykeywords.split(";");
				List<String> list=Arrays.asList(key);
				if(list.contains(keywords)){
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
	
		//根据时间搜索
	public LinkedList<Paper> searchByPaperYear(String year){
		try{
			LinkedList<Paper>a=new LinkedList();
			stmt = conn.createStatement(); 
			String sql= "select * from paper";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String myyear=(String)rs.getString(10);
				String[] y=myyear.split("/");
				List<String> list=Arrays.asList(y);
				if(list.contains(year)){
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
		
		//根据刊物搜索
	public LinkedList<Paper> searchByPaperPublication(String publication){
		try{
			LinkedList<Paper>a=new LinkedList();
			stmt = conn.createStatement(); 
			String sql= "select * from paper where publication = '"+publication+"'";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				Paper p=new Paper((int)rs.getInt(1),(String)rs.getString(2),(String)rs.getString(3),
				(String)rs.getString(4),(String)rs.getString(5),(String)rs.getString(6),(String)rs.getString(7),
				(String)rs.getString(8),(String)rs.getString(9),(String)rs.getString(10),(String)rs.getString(11));
				a.add(p);
			}
			return a;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	//根据参考文献名称搜索
	public LinkedList<Reference> searchByReferenceName(String referenceName){
		try{
			LinkedList<Reference>a=new LinkedList();
			stmt = conn.createStatement(); 
			String sql= "select * from reference where paperName = '"+referenceName+"'";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				 Reference p=new Reference((int)rs.getInt(1),(String)rs.getString(2),(String)rs.getString(3),
				(String)rs.getString(4),(String)rs.getString(5),(String)rs.getString(6),(String)rs.getString(7),
				(String)rs.getString(8),(String)rs.getString(9),(String)rs.getString(10));
				a.add(p);
			}
			return a;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	//根据参考论文作者搜索
	public LinkedList<Reference> searchByReferenceAuthor(String authorName){
		try{
			LinkedList<Reference>a=new LinkedList();
			stmt = conn.createStatement(); 
			String sql= "select * from reference";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String author=(String)rs.getString(3);
				String[] au=author.split(";");
				List<String> list=Arrays.asList(au);
				if(list.contains(authorName)){
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
	
	//根据关键词搜索
	public LinkedList<Reference> searchByReferenceKeywords(String keywords){
		try{
			LinkedList<Reference>a=new LinkedList();
			stmt = conn.createStatement(); 
			String sql= "select * from reference";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String mykeywords=(String)rs.getString(4);
				String[] key=mykeywords.split(";");
				List<String> list=Arrays.asList(key);
				if(list.contains(keywords)){
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
	
		//根据时间搜索
	public LinkedList<Reference> searchByReferenceYear(String year){
		try{
			LinkedList<Reference>a=new LinkedList();
			stmt = conn.createStatement(); 
			String sql= "select * from reference";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String myyear=(String)rs.getString(10);
				String[] y=myyear.split("/");
				List<String> list=Arrays.asList(y);
				if(list.contains(year)){
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
		
		//根据刊物搜索
	public LinkedList<Reference> searchByReferencePublication(String publication){
		try{
			LinkedList<Reference>a=new LinkedList();
			stmt = conn.createStatement(); 
			String sql= "select * from reference where publication = '"+publication+"'";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				Reference p=new Reference((int)rs.getInt(1),(String)rs.getString(2),(String)rs.getString(3),
				(String)rs.getString(4),(String)rs.getString(5),(String)rs.getString(6),(String)rs.getString(7),
				(String)rs.getString(8),(String)rs.getString(9),(String)rs.getString(10));
				a.add(p);
			}
			return a;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
}
