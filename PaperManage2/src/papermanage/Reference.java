package papermanage;
import java.util.LinkedList;
import java.util.List;

public class Reference {
	private String referenceName; 
	private int id; 
	//List<String> author; 
	//List<String> keyWords; 
	private String author;
	private String keywords;
	private String sort1,sort2,sort3;  
	private String publication;  
	private String workload;
	private String date;  
	
	
	public Reference()
	{
		//author = new LinkedList<String>();
		//keyWords = new LinkedList<String>();
		//reference = new LinkedList<String>();
	}
	
	public Reference(int id,String referenceName,String author,String keywords,String sort1,String sort2,String sort3,String publication,String workload,String date){
		this.id=id;
		this.referenceName=referenceName;
		this.author=author;
		this.keywords=keywords;
		this.sort1=sort1;
		this.sort2=sort2;
		this.sort3=sort3;
		this.publication=publication;
		this.workload=workload;
		this.date=date;
	}
	
	public void setId(int id){
		this.id=id;
	}
	
	public int getId(){
		return id;
	}
	
	
	public void setReferenceName(String str)
	{
		referenceName=str;
	}
	
	public String getReferenceName()
	{
		return referenceName;
	}
	
	public void setSort1(String str)
	{
		sort1=str;
	}
	
	public String getSort1()
	{
		return sort1;
	}
	
	public void setSort2(String str)
	{
		sort2=str;
	}
	
	public String getSort2()
	{
		return sort2;
	}
	
	public void setSort3(String str)
	{
		sort3=str;
	}
	
	public String getSort3()
	{
		return sort3;
	}
	
	public void setPublication(String str)
	{
		publication=str;
	}
	
	public String getPublication()
	{
		return publication;
	}
	
	public void setWorkload(String str)
	{
		workload=str;
	}
	
	public String getWorkload()
	{
		return workload;
	}
	
	public void setDate(String str)
	{
		date=str;
	}
	
	public String getDate()
	{
		return date;
	}
	
	public void setAuthor(String str)
	{
		author=str;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public void setKeywords(String str)
	{
		keywords=str;
	}
	
	public String getKeywords()
	{
		return keywords;
	}
	
}

