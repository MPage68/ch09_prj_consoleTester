import java.util.Scanner;

public class ConsoleIO implements UserIOer {

	private Scanner sc;

	public ConsoleIO() {
		super();
		this.sc = new Scanner(System.in);

	}

	@Override
	public int getInt(String prompt) {
		// TODO Auto-generated method stub
		int i = 0;
		boolean isValid = false;
		while (!isValid) {
			print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				println("Error! Invalid integer. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return i;
	}

	@Override
	public int getInt(String prompt, int min, int max) {
		// TODO Auto-generated method stub
		int i = 0;
		boolean isValid = false;
		while (!isValid) {
			i = getInt(prompt);
			if (i <= min) {
				println("Error! Number must be greater than " + min + ".");
			} else if (i >= max) {
				println("Error! Number must be less than " + max + ".");
			} else {
				isValid = true;
			}
		}
		return i;

	}

	@Override
	public double getDouble(String prompt) {
		// TODO Auto-generated method stub
		double d = 0;
		boolean isValid = false;
		while (!isValid) {
			print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			} else {
				println("Error! Invalid number. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return d;
	}

	@Override
	public double getDouble(String prompt, double min, double max) {
		// TODO Auto-generated method stub
		double d = 0;
		boolean isValid = false;
		while (!isValid) {
			d = getDouble(prompt);
			if (d <= min) {
				println("Error! Number must be greater than " + min + ".");
			} else if (d >= max) {
				println("Error! Number must be less than " + max + ".");
			} else {
				isValid = true;
			}
		}
		return d;

	}

	@Override
	public String getString(String prompt) {
		// TODO Auto-generated method stub
		boolean isValid = false;
		String s = "";
		while (!isValid) {
			print(prompt);

			s = sc.nextLine();
			if (s.equals("")) {
				println("Error, This entry is required");
			} else {
				isValid = true;
			}
		}
		return s;
	}

	@Override
	public String getString(String prompt, String s1, String s2) {
		// TODO Auto-generated method stub
		boolean isValid = false;
		String s = "";
		while (!isValid) {
			s = getString(prompt);
			if (s.equalsIgnoreCase(s1) || s.equalsIgnoreCase(s2)) {
				isValid = true;
			} else {
				println("Error! Entry must be 'x' or 'y'. Try again.");
			}
			sc.nextLine();
		}

		return s;

	}

	@Override
	public void println() {
		// TODO Auto-generated method stub
		System.out.println();
	}

	@Override
	public void println(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
	}

	@Override
	public void print(String s) {
		// TODO Auto-generated method stub
		System.out.print(s);
	}

}
