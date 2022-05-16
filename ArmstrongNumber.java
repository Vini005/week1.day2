package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int input = 153; 
		int multiple = 0;
		int reminder;
		int quotient;
		
		int originalNum = input;

		while(input > 0)
		{
		reminder = input % 10;
		System.out.println("reminder" + reminder);
		
		multiple = (reminder * reminder * reminder) + multiple ;
		System.out.println(multiple);

		quotient = input / 10;
		input=quotient-1;
		System.out.println("quotient" + quotient);
		input++;
		
//		(Or)
//		input = input / 10;
//		System.out.println("quotient" + input);
		
		}

		System.out.println("Output is:" + multiple);
		
		if(multiple == originalNum)
		{
			System.out.println("It's an Armstrong Number:" + multiple);
		} else 
		{
			System.out.println("It's not an Armstrong Number:" + multiple);
		}

	}
	}

