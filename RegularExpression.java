//10.Write a program to search a specific string from the given set of strings using regular expressions.
package assignment;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		System.out.println(Pattern.matches(
	            "geeksforge*ks", "geeksforgeeks"));
		System.out.println(
	            Pattern.matches("g*geeks*", "geeksfor"));
	 

	}

}
