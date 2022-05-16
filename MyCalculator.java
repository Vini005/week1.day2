package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(1000, 500);
		double subRes = cal.sub(1000, 500);
		System.out.println("Sub: " + subRes);
		System.out.println("Mul: " + cal.mul(1000.11, 500.55));
		System.out.println("Div: " + cal.div(33.5F, 227f));
		
	}

}
