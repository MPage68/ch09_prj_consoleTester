
public class UserIOTestApp {

	public static void main(String[] args) {

		ConsoleIO c = IOFactory.getUserIO();

		c.println("Welcome to the Console Tester application");
		c.println();

		c.println("Int Test");
		c.getInt("Enter an integer between -100 and 100:  ", -101, 101);

		c.println("Double Test");
		c.getInt("Enter any number between -100 and 100:  ", -101, 101);

		c.println("Required String Test");
		c.getString("Enter your email address:\n");

		c.println("String Choice Test");
		c.getString("Select one (x/y):\n", "x", "y");

	}

}
