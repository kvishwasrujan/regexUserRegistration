package regexJava;

//importing packages
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexUC4 {
	// main method
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// condition for PhoneNumber
		final String PHONE_NUM = "^[0-9]{2}[\\s]{1}[0-9]{10}$";
		System.out.println("Enter the PhoneNum");
		String INPUT=sc.nextLine();
		Pattern pattern = Pattern.compile(PHONE_NUM);
		Matcher matcher = pattern.matcher(INPUT);
		System.out.println("Input String matches regex-" + matcher.matches());
	}

}

