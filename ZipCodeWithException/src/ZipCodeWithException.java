import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZipCodeWithException {

	private String value;

	public ZipCodeWithException() {

	}

	public String getValue() {
		return value;
	}

	public boolean checkLenght(String s){
		try{
			if(s.length()==5 || s.length()==9){
				setValue(s);
				return true;
			}
		}
		catch(NumberFormatException e){
			throw new NumberFormatException("Error");
			
		}
		return false;
	}
	public void setValue(String value) {
		char[] values = value.toCharArray();
		boolean containsOnlyDigits = false;
		for (char c : values) {
			if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8'
					|| c == '9') {
				containsOnlyDigits = true;
			} else {
				containsOnlyDigits = false;
				break;
			}
		}

		if (containsOnlyDigits && (value.length() == 5 || value.length() == 9)) {
			this.value = value;
		}
	}
	
	

	public static void main(String[] args) throws IOException {
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		String s = bufferRead.readLine();

		ZipCodeWithException zipCode = new ZipCodeWithException();

		zipCode.setValue(s);

		System.out.println(zipCode.getValue());

	}
}
