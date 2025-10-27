package module6._2exercises;

public class Sum {

	public static double sumLoop(double[] array){  //okay so I got it to work as a for loop; now let's do it with recursion
		double sum = 0;
		for (int i=0; i<array.length; i++){
			sum+=array[i];
		}
		return sum;
	}

	public static double sum(double[] array){
		double sum = 0.0;
		int i = array.length-1;
		sum = sumHelper(array, sum, i);
		return sum;
	}

	public static double sumHelper(double[] array, double sum, int i){
		if (i<0){
			return sum;
		}
		else {
			return array[i] + sumHelper(array,sum,i-1);
		}
	}

	// public static double[] sumHelpler(double[] array){
	// 	double[] newArray = new double[array.length-1];
	// 	return newArray; // not done yet

	// }

	public static void main(String[] args) {
		double[] lesMisArray = {2,4,6,0,1};
		System.out.println(sumLoop(lesMisArray));
		System.out.println(sum(lesMisArray));
	}
}
