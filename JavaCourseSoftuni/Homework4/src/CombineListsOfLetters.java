import java.util.*;


public class CombineListsOfLetters {
    public static List<Character> asList(final String string) {
        return new AbstractList<Character>() {
            public int size() { return string.length(); }
            public Character get(int index) { return string.charAt(index); }
        };
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstList = scanner.nextLine();
        String secondList = scanner.nextLine();
        List<String> firstListSymbols= new ArrayList<String>(Arrays.asList(firstList.trim().split(" ")));
        List<String> secondListSymbols = new ArrayList<String>(Arrays.asList(secondList.trim().split(" ")));
        List<String> symbolsToAdd = new ArrayList<String>();

        for (int i = 0; i < secondListSymbols.size(); i++) {
            if (!firstListSymbols.contains(secondListSymbols.get(i))){
                symbolsToAdd.add(secondListSymbols.get(i));
            }
        }
        for (int i = 0; i < symbolsToAdd.size(); i++) {
            firstListSymbols.add(symbolsToAdd.get(i));
        }
        System.out.println(String.join(" ", firstListSymbols));

//        char[] c = firstList.toCharArray();
//        List<Character> firstL = new ArrayList<>();
//
//        for (int i = 0; i < c.length; i++) {
//            firstL.add(c[i]);
//        }

    }
}