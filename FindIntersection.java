package week1.day2;

import java.util.Iterator;

public class FindIntersection {

	public static void main(String args[])
	{
		int[] intarray1= {3,2,11,4,6,7};
		int[] intarray2= {1,2,8,4,9,7};
		
		for (int i = 0; i < intarray1.length; i++) {
			
			for (int j = 0; j < intarray2.length; j++) {
				
				if (intarray1[i]==intarray2[j]) {
					System.out.println("Matching value"+intarray1[i]);
				}
			}
		}
	}
}
