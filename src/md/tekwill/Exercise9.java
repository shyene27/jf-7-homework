package md.tekwill;

public class Exercise9 {

    public static void main(String[] args) {
        String names = "Alexei,Andrei,Eugen,Jana,Luca,Olea,Serghei,Sergiu,Victor,Vitalie,Vlad";
	 /* Use JDK documentation for String class and find the methods that
	  would help you determine if 'Ion' and 'Jana' are part of the names string.

	  Output print:
	  'Ion is not part of the names variable'
	  'Jana is part of the names variable'
	  */

        String search1 = "Ion";
        String search2 = "Jana";
        int i = names.indexOf(search1);
        int j = names.indexOf(search2);

        if (i==-1) System.out.println("Ion is not part of the names variable");
        else System.out.println("Ion is part of the names variable");

        if (j==-1) System.out.println("Jana is not part of the names variable");
        else System.out.println("Jana is part of the names variable");
    }
}
