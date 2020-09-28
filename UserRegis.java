package regexJava;

//importing packages
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUC7 {
	public static void main(String[] args) {
		// condition for Password
		final String PASSWORD = "^(?=.*[A-Z])(?.*[0-9])[a-zA-Z0-9]{8}$";
		final String INPUT = "Adeu35bg";
		Pattern pattern = Pattern.compile(PASSWORD);
		Matcher matcher = pattern.matcher(INPUT);
		System.out.println("Input String matches regex-" + matcher.matches());
	}
}

