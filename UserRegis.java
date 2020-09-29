package regexJava;

//importing packages
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexUC4 {
	// main method
	public static void main(String[] args) {
		// condition for PhoneNumber
		final String PHONE_NUM = "^[0-9]{2}[\\s]{1}[0-9]{10}$";
		final String INPUT = "91 1234567891";
		Pattern pattern = Pattern.compile(PHONE_NUM);
		Matcher matcher = pattern.matcher(INPUT);
		System.out.println("Input String matches regex-" + matcher.matches());
	}

}

