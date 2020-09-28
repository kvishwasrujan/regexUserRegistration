package regexJava;

//importing packages
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexUC5 {
	// main method
	public static void main(String[] args) {
		// condition for Password
		final String PASSWORD = "^[A-Za-z0-9]{8}$";
		final String INPUT = "Aedffr4e";
		Pattern pattern = Pattern.compile(PASSWORD);
		Matcher matcher = pattern.matcher(INPUT);
		System.out.println("Input String matches regex-" + matcher.matches());
	}

}

