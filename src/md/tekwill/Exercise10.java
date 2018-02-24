package md.tekwill;

public class Exercise10 {

    public static void main(String[] args) {
        String names = "Alexei,Andrei,Eugen,Jana,Luca,Olea,Serghei,Sergiu,Victor,Vitalie,Vlad";

        /* Use JDK documentation for String class and find the methods that
	  would help you check whether names variable starts with 'Alexei' and doesn't end with 'Ion'

	  Output print:
	  'Variable value starts with Alexei'
	  'Variable value doesn't end with Ion'
	  */

        String search1 = "Alexei";
        String search2 = "Ion";
        int i = names.indexOf(search1);
        int j = names.indexOf(search2);

        if (i==0) System.out.println("Variable value starts with Alexei");

        if (j!=(names.length()-search2.length())) System.out.println("Variable value doesn't end with Ion");
    }
}
