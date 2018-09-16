
public class ConsoleIO implements UserIOer {
	
	private String input;
	private String output;
	public String sc;
	
	

	public ConsoleIO(String input, String output, String sc) {
		super();
		this.input = input;
		this.output = output;
		this.sc = sc;
		
		
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public String getSc() {
		return sc;
	}

	public void setSc(String sc) {
		this.sc = sc;
	}

	@Override
	public int getInt(String prompt) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getInt(String prompt, int min, int max) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getDouble(String prompt) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getDouble(String prompt, double min, double max) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getString(String prompt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getString(String prompt, String s1, String s2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void print(String s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void println() {
		// TODO Auto-generated method stub

	}

	@Override
	public void println(String s) {
		// TODO Auto-generated method stub

	}

}
