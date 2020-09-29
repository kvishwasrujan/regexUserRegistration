package regexJava;

//importing packages
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexUC5 {
	// main method
	public static void main(String[] args) {
		// condition for Password
		final String PASSWORD = "^[A-Za-z0-9]{8}$";
	        Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Password");
		String INPUT=sc.nextLine();
		Pattern pattern = Pattern.compile(PASSWORD);
		Matcher matcher = pattern.matcher(INPUT);
		System.out.println("Input String matches regex-" + matcher.matches());
	}

}

