package md.tekwill;

public class Exercise3 {

    public static void main(String[] args) {
        String abracadabra = "abracadabra";

	 /* Use JDK documentation for String class and find a method that
	  would help you replace all occurrences of character 'a' with character 'A'.

	  Perform the replacement and print the result.
	  */

	 String bbb = abracadabra.replaceAll("a", "A");
        System.out.println(bbb);
    }
}
