package regexJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexUC9 {
	public static void main(String[] args) {
		// main method
		// condition for Email
		final String Email = "^abc.{4}[a-z]{3}@bl.co.{7}[a-z]{2}$";
		final String INPUT = "abc.xyz@bl.co.ww";
		Pattern pattern = Pattern.compile(Email);
		Matcher matcher = pattern.matcher(INPUT);
		System.out.println("Input String matches regex-" + matcher.matches());
	}
}

