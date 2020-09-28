package regexJava;

//importing packages
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
	// main method
	public static void main(String[] args) {
		// compare pattern
		final String s = "^[A-Z]{1}[a-zA-Z]{2,}$";
		final String i = "Aer";
		Pattern pattern = Pattern.compile(s);
		Matcher matcher = pattern.matcher(i);
		// print message
		System.out.println("Input String matches regex-" + matcher.matches());
	}

}
