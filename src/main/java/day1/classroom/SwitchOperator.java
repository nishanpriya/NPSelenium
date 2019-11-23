package day1.classroom;

public class SwitchOperator {

	/*
	 * Goal: Perform calculation based on the user input operations
	 * 
	 * inputs: 2,3 and "add"
	 * output: added value: 5
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a Switch case: type 'switch', followed by: ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */	

	public static void main(String[] args) {

		// Declare 2 integer numbers

		int a=2, b=3;


		// Declare a String variable with input as operations (Tip:

		//String add;
		// Initiate switch case for operations
		switch ("Mul") {
		case "add":
			System.out.println("added value "+(a+b));
			break;
		case "sub":
			System.out.println("Subtract value "+(a-b));
			break;
		case "Mul":
			System.out.println("Multiplied value "+(a*b));
			break;
		case "Div":
			System.out.println("Divided value "+(a/b));
			break;
		default:
			System.out.println("Error");
			break;
		}



		// Within switch, include as case for add operation


		// Within switch, include as case for sub operation


		// Within switch, include as case for mul operation


		// Within switch, include as case for div operation


		// Within switch, include 'default' to handle other operations


		//end of switch case

	}

}
