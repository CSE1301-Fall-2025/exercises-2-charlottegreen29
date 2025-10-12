package module5._2parameters;

/*
 * Exercise: Create a calculatePay method and use it to replace
 * the redundant code within the main method.
 */
public class E02PayrollCalculator {

	//add a new static method calculatePay here

	public static void calculatePay(String employee, double hourlyRate, double hoursWorked){
		double weeklyPay = hourlyRate * hoursWorked;
	    System.out.println(employee  + ":" + weeklyPay);
	}

	public static void main(String[] args) {

	    //Calculate weekly pay for Fred
		calculatePay("Fred",12.50,20);
	      
	    //Calculate weekly pay for Amir 
		calculatePay("Amir",15.0,35);
	}
}

