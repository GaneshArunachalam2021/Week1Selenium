package week1.day2;



public class Calculator {
	
	public int add(int a , int b) {
		return a+ b;

	}
	public int sub(int a , int b) {
		return a- b;

	}
	public int Multiply(int a , int b) {
		return a * b;

	}
	public int Divide(int a , int b) {
		return a * b;

	}
	
	public static void main(String[] args)
	{
		Calculator c = new Calculator();
		System.out.println(c.add(2,3));
		System.out.println(c.sub(2,3));
		System.out.println(c.Multiply(2,3));
		System.out.println(c.Divide(2,3));
	}

}
