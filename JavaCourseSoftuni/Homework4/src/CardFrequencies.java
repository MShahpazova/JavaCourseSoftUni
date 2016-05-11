import java.util.*;


public class CardFrequencies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = new ArrayList<>(Arrays.asList(scanner.nextLine().trim().split("[???? ]")));
        input.removeAll(Arrays.asList(null, ""));
        Map <String,Integer> faces = new HashMap<String, Integer>();
        for (int i = 0; i < input.size(); i++) {
            int count = faces.containsKey(input.get(i)) ? faces.get(input.get(i)) : 0;
            faces.put(input.get(i), count + 1);
            for (Map.Entry<String, Integer> entry : faces.entrySet()) {
                float percent = (entry.getValue() / (float)input.size()) * 100f;
                System.out.printf( "%s -> %.2f\n", entry.getValue(), percent);
            }
        }
    }
}
