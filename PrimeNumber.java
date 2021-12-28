package week1.day2;

public class PrimeNumber {

	public static void main(String args[])
	{
		int input=12;
		boolean isprime= true;
		for(int i=2;i<input;i++)
		{
			System.out.println("value of i"+ i);
			if(input%i!=0)
			{
				isprime=false;
			}
		}
		
		if (!isprime) {
			System.out.println("Prime number");
		}
	}
}
