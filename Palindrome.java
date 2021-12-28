package week1.day2;

public class Palindrome {

	public static void main(String[] args)
	{
		String str1="madam";
		String str2="madam";
		String revstr="";
		
		for (int i = str2.length()-1; i >= 0; i--) {
			revstr = revstr +str2.charAt(i);
		}
		System.out.println("revstr "+revstr);
		if (str1.equalsIgnoreCase(revstr))
		{
			System.out.println("Palindrome string "+str1);
		}
	}
}
