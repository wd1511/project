package papermanage;

public class test {
	public static void main(String []arg){
		Manager a=new Manager();
		
		System.out.println(a.addSort("1", "2", "3"));
		a.addSort("1", "2", "4");
		a.addSort("5", "6", "7");
		a.addSort("5", "8", "9");
	}
}
