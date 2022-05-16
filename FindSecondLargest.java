package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {
	
	static int[] data = {3,2,11,4,6,7};
	
	

	public static void main(String[] args) {
		
		Arrays.sort(data);
		for (int i = 0; i < data.length; i++)   
		{       
		System.out.println(data[i]);   
		} 
		
		int dataLength = data.length;
		int lastDataLength = data.length - 2;
		System.out.println("Length " +dataLength);
		System.out.println("Last Data " +lastDataLength);

	}

}
