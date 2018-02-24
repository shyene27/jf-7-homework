package md.tekwill;

public class Exercise2 {

    public static void main(String[] args) {
        String abracadabra = "abracadabra";

	 /* Use JDK documentation for String class and find a method that
	  would help you determine all the indexes of the letter 'a' in abracadabra.
	  Output: Print all letter 'a' indexes on a separate line.
	  */

        for(int i=0; i<abracadabra.length(); i++) {
            char c = abracadabra.charAt(i);
            if (c == 'a') System.out.println(abracadabra.indexOf(c,i));

        }
    }
}
