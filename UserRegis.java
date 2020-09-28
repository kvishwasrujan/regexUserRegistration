package regexJava;

//importing packages
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexUC2 {
//main method
	public static void main(String[] args) {
		// condition for LastName
		final String LASTNAME = "^[A-Z]{1}[a-zA-Z]{2,}$";
		final String INPUT = "Aedffr";
		Pattern pattern = Pattern.compile(LASTNAME);
		Matcher matcher = pattern.matcher(INPUT);
		System.out.println("Input String matches regex-" + matcher.matches());
	}

}
