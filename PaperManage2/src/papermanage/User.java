package papermanage;
public class User extends Tourist{
	private int id;
	private String username;
	private String password;
	private String authorName;
	private String collectedPapers[];
	
	public User () {
	  
	}
	
	public User(int id,String username,String authorName,String password){
		this.id=id;
		this.username=username;
		this.password=password;
		this.authorName=authorName;
	}
	
	public void setId(int id)
	{
		this.id=id;;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setUsername(String str)
	{
		username=str;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public void setPassword(String str)
	{
		password=str;
	}
	
	public String getPassword()
	{
		return password;
	}
	public void setAuthorName(String authorName)
	{
		this.authorName=authorName;
	}
	
	public String getAuthorName()
	{
		return authorName;
	}
}
