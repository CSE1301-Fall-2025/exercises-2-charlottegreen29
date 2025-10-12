package module5._3return;

/*
 * Exercise: Update this code so that instead of printing
 * the centimeters value in the inchesToCentimeters() method,
 * it returns the centimeters value and prints it from the
 * main() method.
 */
public class E02InchesToCentimeters {
	public static double inchesToCentimeters(double inches) {
		double centimeters = inches * 2.54;
		return centimeters;
	}

	public static void main(String[] args) {
		System.out.println(inchesToCentimeters(10));
		System.out.println(inchesToCentimeters(12.5));
	}
}
