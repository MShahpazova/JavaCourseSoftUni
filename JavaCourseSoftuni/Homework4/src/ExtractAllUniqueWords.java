import java.util.*;


public class ExtractAllUniqueWords {
    public static void main(String[] args) {
      String splitPattern = "[^A-Za-z]";
        Scanner scanner = new Scanner(System.in);
        String sentense = scanner.nextLine();
        String [] words =  sentense.split(splitPattern);
//        System.out.println(String.join(" ", words));
        HashSet<String> uniqueValues = new HashSet<String>();

        for (int i = 0; i < words.length; i++) {
            uniqueValues.add(words[i]);
        }
        //System.out.println(String.join("", uniqueValues));
        uniqueValues.remove(null);
        uniqueValues.remove("");
        System.out.println(String.join(" ", uniqueValues));
        Iterator iterator = uniqueValues.iterator();
//        while (iterator.hasNext()){
//            Object word = iterator.next();
//            System.out.print(word + " ");
//        }
//        for (int i = 0; i < uniqueValues.size(); i++) {
//            if (i < uniqueValues.size() -1){
//                System.out.println(uniqueValues.get(i) + " ");
//            }
//
//        }
    }
}
