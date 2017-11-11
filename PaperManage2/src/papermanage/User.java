package papermanage;
public class User extends Tourist{
	private int id;
	private String username;
	private String password;
	private String collectedPapers[];
	
	public User(){
	}
	
	public User(int id,String username,String password){
		this.id=id;
		this.username=username;
		this.password=password;
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
	
}
