public class NewCar {

	// After 5 years I would pay Car A: $30,114.76 or Car B: $37,460.51
	// After 10 years I would pay Car A: $40,259.23 or Car B: $44,293.74
	// printing just shows the value within the print statement, and the return value gives back a result of an equation that can later be used again
public static void main(String[] args) {
		System.out.println(compareCars(0)); // expect Charts Year 0 - Year 0, names most economical car
		System.out.println();
		
		System.out.println(compareCars(1)); // expect Charts Year 0 - Year 1, names most economical car
		System.out.println();
		
		System.out.println(compareCars(5)); //expect  Charts Year 0 - Year 5, names most economical car
		System.out.println();
		
		System.out.println(compareCars(10)); // expect Charts Year 0 - Year 10, names most economical car
		System.out.println();

		System.out.println(compareCars(15)); 
		System.out.println();
}
public static double compoundGrowth(double money, double interestRate, int years) {
		// Loop adds the amount of money earned from interest rate to the current amount
		// of money in the account
	for (int i = 0; i < years; i++) {
		money += (money * interestRate);
	}
		return money;// Return the total amount of money
}
public static double costA(int years) {//Calculates the cost of Car A in a given year
		//Original cost of car + miles driven * cost of gas + maintainence
	return 20000 + ((15000/25 * 2.5) * years) + (compoundGrowth(1300, 0.15, years));
}
public static double costB(int years) {//Calculates the cost of Car B in a given year	
		//Original cost of car + miles driven * cost of gas + maintainence
	return 30000 + ((15000/32 * 2.5) * years) + (compoundGrowth(1000, 0.1, years));
}

public static String compareCars(int years) {
		// Beginning of chart to compare cars, listing Car A and Car B as column headers
	System.out.println("            Car A      Car B");

		// Print out the cost of the cars throughout the years
		for (int i = 0; i <= years; i++) {
			System.out.println("Year " + (i) + "     $" + costA(i) + "    $" + costB(i));
		}
		// Return String naming the most economical car on the last year
	if (costA(years) < costB(years)) {
		return "Most economical car on Year " + years + " is Car A.";
	} else {
		return "Most economical car on Year " + years + " is Car B.";
		}
	}
}
