package ie.itcarlow.lab1;

// Student Name 	: Donavon Fox
// Student Id Number: C00262850
// Date 			: 07/10/2021
// Purpose 			: My first class implementation

public class ThermTest
{ // begin class ThermTest
	public static void main(String args[]) 
	{ // being main method

		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class
		
		Thermometer thermB = new Thermometer(); //Creates the second instance for the lab question

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		
		///////////////////////////////////////////////////////////////////////////
		thermB.setCelsius(10.0);
		System.out.println("Temp. of Thermometer B is " + thermB.getCelsius() );//
		
		
	} // end main
} // end class ThermTest
