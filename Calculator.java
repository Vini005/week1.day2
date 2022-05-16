package week1.day2;

public class Calculator {

	public int add(int a, int b)
	{
		int sum = a + b;
		System.out.println("Sum:" +sum);
		return sum;
	}
	
	public double sub(double a, double b)
	{
		double diff = a - b;
		return diff;
	}
	
	public double mul(double a, double b)
	{
		double mulResult = a * b;
		return mulResult;	
	}
	
	public float div(float a, float b)
	{
//		int div = a/b;
		return a/b;
	}
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.add(50, 100);
		System.out.println("Sub:" + cal.sub(11.5, 55.2));
		double mulRes = cal.mul(10.0, 40.44);
		System.out.println("Mult: " + mulRes);
		System.out.println("Div:" + cal.div(55f, 5F));
	}

}
