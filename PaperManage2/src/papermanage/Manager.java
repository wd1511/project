package papermanage;

import java.sql.*;
import java.util.*;

import java.security.SecureRandom;
import java.util.Random;

public class Manager extends Tourist {
	//Ê∑ªÂä†Áî®Êà∑
	public void addUser(int id,String name,String authorName,String password){
		ConnectMysql c=new ConnectMysql();
		Connection conn=c.retConnect();
		Statement stmt;
		try{
			stmt = conn.createStatement(); 
			String sql= "insert into user values('"+id+"','"+name+"','"+authorName+"','"+password+"')";
			stmt.executeUpdate(sql);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	//Âà†Èô§Áî®Êà∑
	public boolean deleteUser(int id){
		ConnectMysql c=new ConnectMysql();
		Connection conn=c.retConnect();
		Statement stmt;
		try{
			stmt = conn.createStatement(); 
			String sql= "delete from user where id='"+id+"'";
			stmt.executeUpdate(sql);
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	//Â±ïÁ§∫Áî®Êà∑‰ø°ÊÅØ
	public User showUser(int id){
		ConnectMysql c=new ConnectMysql();
		Connection conn=c.retConnect();
		Statement stmt;
		try{
			stmt = conn.createStatement(); 
			String sql= "select * from user where id = '"+id+"'";
			ResultSet rs=stmt.executeQuery(sql);
			User u=new User();
			while(rs.next()){
				u.setId((int)rs.getInt(1));
				u.setUsername((String)rs.getString(2));
				u.setAuthorName((String)rs.getString(3));
				u.setPassword((String)rs.getString(4));
			}
			return u;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	//Â¢ûÂä†ËÆ∫Êñá
	public boolean addPaper(Paper newPaper){
		ConnectMysql c=new ConnectMysql();
		Connection conn=c.retConnect();
		Statement stmt;
		try{
			stmt = conn.createStatement(); 
			String sql= "insert into paper values('"+newPaper.getId()+"','"+newPaper.getPaperName()+"','"+newPaper.getAuthor()
					+"','"+newPaper.getKeywords()+"','"+newPaper.getSort1()+"','"+newPaper.getSort2()+"','"+newPaper.getSort3()
					+"','"+newPaper.getPublication()+"','"+newPaper.getWorkload()+"','"+newPaper.getDate()+"','"+newPaper.getReference()+"','"+newPaper.getAuthorID()+"','"+newPaper.getReferenceID()+"')";
			stmt.executeUpdate(sql);
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	//Â¢ûÂä†ÊñáÁåÆ
	public boolean addReference(Reference newReference){
		ConnectMysql c=new ConnectMysql();
		Connection conn=c.retConnect();
		Statement stmt;
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
	
	//Âà†Èô§ËÆ∫Êñá
	public boolean deletePaper(int id){
		ConnectMysql c=new ConnectMysql();
		Connection conn=c.retConnect();
		Statement stmt;
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
	
	//Âà†Èô§ÊñáÁåÆ
	public boolean deleteReference(int id){
		ConnectMysql c=new ConnectMysql();
		Connection conn=c.retConnect();
		Statement stmt;
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
	
	//‰øÆÊîπËÆ∫Êñá
	public void modifyPaper(Paper newPaper){
		ConnectMysql c=new ConnectMysql();
		Connection conn=c.retConnect();
		Statement stmt;
		
		try{
			stmt = conn.createStatement(); 
			int id=newPaper.getId();
			String sql= "delete from paper where id='"+id+"'";
			stmt.executeUpdate(sql);
			sql= "insert into paper values('"+newPaper.getId()+"','"+newPaper.getPaperName()+"','"+newPaper.getAuthor()
					+"','"+newPaper.getKeywords()+"','"+newPaper.getSort1()+"','"+newPaper.getSort2()+"','"+newPaper.getSort3()
					+"','"+newPaper.getPublication()+"','"+newPaper.getWorkload()+"','"+newPaper.getDate()+"','"+newPaper.getReference()+"')";
			stmt.executeUpdate(sql);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	//‰øÆÊîπÊñáÁåÆ
	public void modifyReference(Reference newReference){
		ConnectMysql c=new ConnectMysql();
		Connection conn=c.retConnect();
		Statement stmt;
		
		try{
			stmt = conn.createStatement(); 
			int id=newReference.getId();
			String sql= "delete from reference where id='"+id+"'";
			stmt.executeUpdate(sql);
			sql= "insert into reference values('"+newReference.getId()+"','"+newReference.getReferenceName()+"','"+newReference.getAuthor()
					+"','"+newReference.getKeywords()+"','"+newReference.getSort1()+"','"+newReference.getSort2()+"','"+newReference.getSort3()
					+"','"+newReference.getPublication()+"','"+newReference.getWorkload()+"','"+newReference.getDate()+"')";
			stmt.executeUpdate(sql);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	//‰øÆÊîπÁî®Êà∑
	public void modifyUser(User newUser){
		ConnectMysql c=new ConnectMysql();
		Connection conn=c.retConnect();
		Statement stmt;
		
		try{
			stmt = conn.createStatement(); 
			int id=newUser.getId();
			String name=newUser.getUsername();
			String password=newUser.getPassword();
			String authorName=newUser.getAuthorName();
			String sql= "delete from user where id='"+id+"'";
			stmt.executeUpdate(sql);
			sql= "insert into user values('"+id+"','"+name+"','"+authorName+"','"+password+"')";
			stmt.executeUpdate(sql);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	//ÃÌº”µΩ∆‰À˚±Ì
	public boolean addOtherPaper(Paper newPaper)
	{
		ConnectMysql c=new ConnectMysql();
		Connection conn=c.retConnect();
		Statement stmt;
		try{
			stmt = conn.createStatement(); 
			String sql= "insert into other_paper values('"+newPaper.getId()+"','"+newPaper.getPaperName()+"','"+newPaper.getAuthor()
					+"','"+newPaper.getKeywords()+"','"+newPaper.getSort1()+"','"+newPaper.getSort2()+"','"+newPaper.getSort3()
					+"','"+newPaper.getPublication()+"','"+newPaper.getWorkload()+"','"+newPaper.getDate()+"','"+newPaper.getReference()+"','"+newPaper.getAuthorID()+"','"+newPaper.getReferenceID()+"')";
			stmt.executeUpdate(sql);
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	//ÃÌº”¿‡±
	public boolean addSort(String sort1,String sort2,String sort3)
	{
		ConnectMysql c=new ConnectMysql();
		Connection conn=c.retConnect();
		Statement stmt;
		LinkedList<String> s1=c.paperSort1();
		int newId=this.generateSortId(100000);
		if(!s1.contains(sort1))
		{
			System.out.println("sdasdsa");
			try{
				stmt = conn.createStatement(); 
				String sql= "insert into paper_sort values('"+newId+"','"+sort1+"','"+sort2
						+"','"+sort3+"')";
				stmt.executeUpdate(sql);
				return true;
			}
			catch(Exception e){
				e.printStackTrace();
				return false;
			}
		}
		else{
			LinkedList<String> s2=c.paperSort2(sort1);
			if(!s2.contains(sort2))
			{
				try{
					stmt = conn.createStatement(); 
					String sql= "insert into paper_sort values('"+newId+"','"+sort1+"','"+sort2
							+"','"+sort3+"')";
					stmt.executeUpdate(sql);
					return true;
				}
				catch(Exception e){
					e.printStackTrace();
					return false;
				}
			}
			else
			{
				try{
					LinkedList<String> s3=c.paperSort3(sort2);
					stmt = conn.createStatement(); 
					String sql= "delete from paper_sort where sort2='"+sort2+"'";
					stmt.executeUpdate(sql);
					String a="";
					for(int i=0;i<s3.size();i++)
					{
						a=a+s3.get(i)+",";
					}
					a=a+sort3;
					sql= "insert into paper_sort values('"+newId+"','"+sort1+"','"+sort2
							+"','"+a+"')";
					stmt.executeUpdate(sql);
					return true;
				}
				catch(Exception e){
					e.printStackTrace();
					return false;
				}
			}
		}
	}
	
	//ÀÊª˙±‡∫≈
	public int generateSortId(int m){
		ConnectMysql c=new ConnectMysql();
		Connection conn=c.retConnect();
		Statement stmt;
		int flag=0;
		int ran=-1;
		while(flag==0){
			SecureRandom random = new SecureRandom();
			ran=random.nextInt(m);
			try{
				stmt = conn.createStatement(); 
				String sql= "select * from paper_sort";
				ResultSet rs = stmt.executeQuery(sql);
				while(flag==0 && rs.next()){
					if(ran!=(int)rs.getInt(1))flag=1;
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		return ran;
	}

}
