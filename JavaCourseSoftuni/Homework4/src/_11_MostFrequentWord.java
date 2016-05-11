

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _11_MostFrequentWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\W+");

        HashMap<String, Integer> occurances = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            String word = input[i].toLowerCase();
            if (occurances.containsKey(word)) {
                occurances.put(word, occurances.get(word) + 1);
            } else {
                occurances.put(word, 1);
            }
        }
        int maxCount = Collections.max(occurances.values());
        Map<String, Integer> wordsWithMaxOccurances = occurances.entrySet()
                .stream()
                .filter(word -> word.getValue() == maxCount)
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));

        ArrayList<String> sortedWords = new ArrayList<String>(wordsWithMaxOccurances.keySet());
        Collections.sort(sortedWords);
        for (String string : sortedWords) {
            System.out.println(string + " -> " + maxCount + " time");
       }
    }
}