
public class UserIOTestApp {

	public static void main(String[] args) {

		// establish console
		ConsoleIO console = IOFactory.getUserIO();
		// Welcome message
		console.println("Welcome to the Console Tester application");
		console.println();

		// int test block
		console.println("Int Test");
		console.getInt("Enter an integer between -100 and 100:  ", -101, 101);

		// double test block
		console.println("Double Test");
		console.getInt("Enter any number between -100 and 100:  ", -101, 101);

		// String test block
		console.println("Required String Test");
		console.getString("Enter your email address:\n");

		// String choice test block
		console.println("String Choice Test");
		console.getString("Select one (x/y):\n", "x", "y");

	}

}
