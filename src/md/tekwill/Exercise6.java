package md.tekwill;

public class Exercise6 {

    public static void main(String[] args) {
        String names = "Alexei,Andrei,Eugen,Jana,Luca,Olea,Serghei,Sergiu,Victor,Vitalie,Vlad";

	 /* Use JDK documentation for String class and find a method that
	  would help you identify the position of word 'Eugen' in the names string.

	  Then find another method that would help you print the string from that position till the end.
	  Expected output: "Eugen,Jana,Luca,Olea,Serghei,Sergiu,Victor,Vitalie,Vlad"
	  */
	 String search = "Eugen";
	 int z = search.length();
	 int i = names.indexOf(search);

	 System.out.println("The position of " + search + " is starting from "+ i + " to "+ (i+z-1));
     System.out.println(names.substring(i));
    }
}
