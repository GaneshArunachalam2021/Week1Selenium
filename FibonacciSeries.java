package week1.day2;

public class FibonacciSeries {
	
	public static void main(String[] args)
	{
		int x1 = 0;
		int x2 = 1;
		int x3;
		System.out.println(x1);
		System.out.println(x2);
		int i=0;
		while (i<6) {
			x3= x1 +x2;
			System.out.println(x3);
			x1=x2;x2=x3;
			i++;
		}
	}
}
