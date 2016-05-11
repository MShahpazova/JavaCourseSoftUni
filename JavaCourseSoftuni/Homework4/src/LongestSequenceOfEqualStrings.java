import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class LongestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String [] strings = input.split(" ");
        Map<String, Integer> values = new HashMap <String, Integer>();
        for (int i = 0; i < strings.length; i++) {
            String string = strings[i];
            int value = values.containsKey(string) ? values.get(string) : 0;
            values.put(string, value + 1);

        }
        int largestValue = 0;
        String key = "";
        for (Map.Entry<String, Integer> entry : values.entrySet()) {
            if (entry.getValue() > largestValue){
                largestValue = entry.getValue();
                key = entry.getKey();
            }
        }
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < largestValue; i++) {
            output.append(key);
            if (i != largestValue - 1){
                output.append(" ");
            }
        }
        System.out.println(output.toString());
    }
}
