package papermanage;
import java.util.LinkedList;
import java.util.List;

public class Paper {
	private String paperName; 
	private int id; 
	//List<String> author; 
	//List<String> keyWords; 
	private String author;
	private String keywords;
	private String sort1,sort2,sort3;  
	private String publication;  
	private String workload;
	private String date; 
	private String reference;  
	private int authorID;
	private String referenceID;
	
	public Paper()
	{
		//author = new LinkedList<String>();
		//keyWords = new LinkedList<String>();
		//reference = new LinkedList<String>();
	}
	
	public Paper(int id,String paperName,String author,String keywords,String sort1,String sort2,String sort3,String publication,String workload,String date,String reference,int authorID,String referenceID){
		this.id=id;
		this.paperName=paperName;
		this.author=author;
		this.keywords=keywords;
		this.sort1=sort1;
		this.sort2=sort2;
		this.sort3=sort3;
		this.publication=publication;
		this.workload=workload;
		this.date=date;
		this.reference=reference;
		this.authorID=authorID;
		this.referenceID=referenceID;
	}
	
	public void setId(int id){
		this.id=id;
	}
	
	public int getId(){
		return id;
	}
	
	
	public void setPaperName(String paperName)
	{
		this.paperName=paperName;
	}
	
	public String getPaperName()
	{
		return paperName;
	}
	
	public void setSort1(String sort1)
	{
		this.sort1=sort1;
	}
	
	public String getSort1()
	{
		return sort1;
	}
	
	public void setSort2(String sort2)
	{
		this.sort2=sort2;
	}
	
	public String getSort2()
	{
		return sort2;
	}
	
	public void setSort3(String sort3)
	{
		this.sort3=sort3;
	}
	
	public String getSort3()
	{
		return sort3;
	}
	
	public void setPublication(String publication)
	{
		this.publication=publication;
	}
	
	public String getPublication()
	{
		return publication;
	}
	
	public void setWorkload(String workload)
	{
		this.workload=workload;
	}
	
	public String getWorkload()
	{
		return workload;
	}
	
	public void setDate(String date)
	{
		this.date=date;
	}
	
	public String getDate()
	{
		return date;
	}
	
	public void setAuthor(String author)
	{
		this.author=author;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public void setKeywords(String keywords)
	{
		this.keywords=keywords;
	}
	
	public String getKeywords()
	{
		return keywords;
	}
	
	public void setReference(String reference)
	{
		this.reference=reference;
	}
	
	public String getReference()
	{
		return reference;
	}
	
	public void setAuthorID(int authorID){
		this.authorID=authorID;
	}
	
	public int getAuthorID(){
		return authorID;
	}

	public void setReferenceID(String referenceID)
	{
		this.referenceID=referenceID;
	}
	
	public String getReferenceID()
	{
		return referenceID;
	}
}
