package md.tekwill;

public class Exercise4 {

    public static void main(String[] args) {
        String abracadabra = "abracadabra";

	 /* Use JDK documentation for String class and find a method that
	  would help you replace the first occurrence character 'r' with character 'R'.

	  Perform the replacement and print the result.
	  */

        String bbb = abracadabra.replaceFirst("r", "R");
        System.out.println(bbb);
    }
}
