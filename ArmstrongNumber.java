package week1.day2;

public class ArmstrongNumber {


   
	public static void main(String args[])
	{
		   int iCalculated=0;
		   int iReminder;
		   int iOriginal=153;
		   int itemp=iOriginal;
		   while (itemp>0) {
			 
			iReminder = itemp%10;
			itemp = itemp/10;
			System.out.println(iReminder);
			System.out.println(iOriginal);
			iCalculated = iCalculated+ iReminder*iReminder*iReminder;
			System.out.println(iCalculated);
		}
			
		if (iCalculated==iOriginal) {
			System.out.println(iCalculated +" is Amstrong number");
			
		}
	}
	
}
