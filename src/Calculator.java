import gov.nasa.jpf.jvm.Verify;

public class Calculator {
	int add (int a, int b) {
		return a+b;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = Verify.getInt(1, 2);
		int b = Verify.getInt(5, 8);
		Calculator cal = new Calculator();
		System.out.println(a+"+"+b+"="+cal.add(a,b));
	}

}