package automobile;
// Three ways to achieve method overloading
// 1. Different Number of parameters in arguments list
// 2. Different in data type of arguments
// 3. Difference is sequence of data type of arguments
// 4. Cannot overload just on return type

public class CarsOverloadingQuestions {
	public static void main(String[] args) {
		increaseSeatHeight("2", 2);
		increaseSeatHeight("2", "2");
	}
	
	public static void increaseSeatHeight(String variable1, int variable2) {
		System.out.println("I am the 1st overload.");
	}
	
	public static void increaseSeatHeight(String variable3, String variable4) {
		System.out.println("I am the 2nd overload.");
	}
}
