import java.util.*;
import java.util.regex.Pattern;



public class CognateWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String pattern = "[^A-Za-z]";
        //Pattern slpitPattern = Pattern.compile("[^A-Za-z]");

        String [] inputWords = input.split(pattern);

        ArrayList<String> words = new ArrayList<String>(Arrays.asList(inputWords));
        //String[] words = input.split(pattern);
        words.removeAll(Collections.singleton(null));
        words.removeAll(Collections.singleton(""));

        HashSet<String> output = new HashSet<String>();


        String possibleMatch = "";
        for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < words.size(); j++) {
                possibleMatch = words.get(i)+ words.get(j);

                for (int k = 0; k < words.size(); k++) {
                    String word = words.get(k);
                    if (possibleMatch.equals(word) ){
                        output.add(String.format("%s|%s=%s", words.get(i), words.get(j), words.get(k)));

                    }
                }
            }

        }
        if ( output.isEmpty()){
            System.out.println("No");
        }
        else {

            System.out.println(String.join("\n", output));
        }
    }
}
