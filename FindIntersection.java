package week1.day2;
/*
 * Pseudo Code

 * a) Declare An array for {3,2,11,4,6,7};	 
 * b) Declare another array for {1,2,8,4,9,7};
 * c) Declare for loop iterator from 0 to array length
 * d) Declare a nested for another array from 0 to array length
 * e) Compare Both the arrays using a condition statement
 
 *  f) Print the first array (shoud match item in both arrays)
 */

public class FindIntersection {

	public static void main(String[] args) {
	
		int arr1[] = {3,2,11,4,6,7};
		int arr2[] = {1,2,8,4,9,7};
		
		for(int i = 0; i < arr1.length; i++)
		{
//			System.out.println(arr1[i]);
			for(int j = 0; j < arr2.length; j ++)
			{
//				System.out.println("arr2: " + arr2[j]);
				if(arr1[i] == arr2[j])
				{
					System.out.println("Intersection Numbers are: " + arr1[i]);
				}
			}
		}

	}

}