import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created by maria on 9/15/2015.
 */
public class Weightlifting {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        in.nextLine();
        HashMap<String, HashMap<String, Integer>> players = new HashMap<>();
        for (int i = 0; i < number; i++) {

            String [] data = in.nextLine().split(" ");
            String name = data[0];
            String exercise = data[1];
            int weight = Integer.parseInt(data[2]);
            if (!players.containsKey(name)){
                players.put(name, new HashMap<String, Integer>());
                players.get(name).put(exercise, weight);
            }
            else {
                if (! players.get(name).containsKey(exercise)){
                    players.get(name).put(exercise, weight);
                }
                else {
                    int value = players.get(name).get(exercise);
                    players.get(name).put(exercise, value += weight);
                }
            }
        }

    }
}
