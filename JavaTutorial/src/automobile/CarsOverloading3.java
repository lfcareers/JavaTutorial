package automobile;

/***
 * Sequence of data type of arguments
 * @author loganfoster
 *
 */
public class CarsOverloading3 {

	public static void main(String[] args) {
		increaseSeatHeight("2", 2);
		increaseSeatHeight(8,"8");
	}
	
	public static void increaseSeatHeight(String variable1, int variable2) {
		System.out.println("I am the 1st overload.");
	}
	
	public static void increaseSeatHeight(int variable1, String variable2) {
		System.out.println("I am the 2nd overload.");
	}
}
