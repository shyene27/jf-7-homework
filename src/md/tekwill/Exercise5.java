package md.tekwill;

public class Exercise5 {

    public static void main(String[] args) {
        String names = "Alexei,Andrei,Eugen,Jana,Luca,Olea,Serghei,Sergiu,Victor,Vitalie,Vlad";

	 /* Use JDK documentation for String class and find a method that
	  would help you split the names string by ',' and get as a result an array.

	  Print every name on a separate line.
	  */
	 String[] results = names.split(",");
	 for (String result:results){
         System.out.println(result);
     }
    }
}
