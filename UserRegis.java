package regexJava;

//importing packages
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUC8 {
	public static void main(String[] args) {
		// condition for Password
		Scanner sc= new Scanner(System.in);
		final String PASSWORD = "^(?=.*[A-Z])(?.*[0-9])(?.*[!@#$%^&*])[a-zA-Z0-9]{8}$";
		System.out.println("Enter the Password");
		String INPUT=sc.nextLine();
		Pattern pattern = Pattern.compile(PASSWORD);
		Matcher matcher = pattern.matcher(INPUT);
		System.out.println("Input String matches regex-" + matcher.matches());
	}
}
