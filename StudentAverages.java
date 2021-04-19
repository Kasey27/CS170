//This method calculates the average grades.

public class StudentAverages {
	public static void main (String[] args){
	    studentaverages(new int[][] {{88,90,70}, {80,30,90,100},{80,100,77}, {77,77,80}}); //Output: 82.666, 75.0, 85.666,78.0
	    studentaverages(new int[][]{{60,50,100}, {100,50,80},{33,100,77}}); //Output: 70.0, 76.666, 70.0
	    studentaverages(new int[][]{{50,100,0}, {100,100,50,80}}); //Output: 50.0, 82.5
	    studentaverages(new int[][]{{90,85,77}, {100,50,80}}); //OUtput 84.0, 76.666
	}
	//This method takes a 2D array and returns an array of type double with the average
	//scores of each student
	public static double[] studentaverages(int[][] x){
		//initalize a new array with the same length as x
		double[] newArray = new double[x.length];
		 //initialize a variable for the indexes of the new array
		int k = 0;
	     //nested for loop takes the average of the elements found in row x[i]
		for(int i = 0; i < x.length; i++){
         //initialize result in the beginning so it resets after every iteration
			double result = 0.0;
		   for(int j = 0; j < x[i].length; j++){
		//adds elements from row x[i] at index j together
		   	result += x[i][j];
		   }
		//divides result by the number of elements in the row x[i]
		 result = result / x[i].length;

		int m =0;
		//Assigns the calcualted result to an index in the new array
		if( m < newArray.length) {
			newArray[k] = result;
			k++;
		}
		}
		//converts the new array into a string and returns it
		System.out.println(arraytoString(newArray));
		return newArray;
	}
	//Helper method to output the elements of the new array
	public static String arraytoString(double[] x){
	 	String result = "[";
	 	for(int i = 0; i < x.length - 1; i++){
	 		result += x[i] + ", ";
	 	}
	 	if(x.length > 0){
	 		result += x[x.length -1];
	 	}
	 	result += "]";
	 	return result;
	}
}
