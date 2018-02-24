package md.tekwill;

public class Exercise11 {

    public static void main(String[] args) {
        String[] names = {"Alexei", "Andrei", "Eugen", "Jana",
                "Luca", "Olea", "Serghei", "Sergiu", "Victor",
                "Vitalie", "Vlad"};

       /*
       * Use the StringBuilder to join all the array elements into one single string.
       * Elements should be comma separated.
       *
       * Output: "Alexei,Andrei,Eugen,Jana,Luca,Olea,Serghei,Sergiu,Victor,Vitalie,Vlad"
       * */

        StringBuilder sb = new StringBuilder();
        for (String name:names){
            sb.append(name+",");
        }
        System.out.println(sb);
    }
}
