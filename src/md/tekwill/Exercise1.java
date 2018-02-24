package md.tekwill;

public class Exercise1 {

    public static void main(String[] args) {
	 String alice = "Alice";
	 String bob = "Bob";

	 /* Use JDK documentation for String and find a method that
	  would help you determine which of the strings above lexicographically
	  precede the second and print that string.
	  */

	 int compare = alice.compareTo(bob);

	 if(compare>0) System.out.println(bob);
	 else if (compare<0)System.out.println(alice);
	 else System.out.println("the strings are lexicographically equal");

    }
}
