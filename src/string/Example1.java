package string;

public class Example1 {
	public static void main(String[] args)
	{
		String org="supriya is enginerr";
				String rev="";
		for(int i=org.length()-1; i>0; i--)
		{
			rev=rev+org.charAt(i);
			
		}
		System.out.println(rev);
	}
	
	

}
