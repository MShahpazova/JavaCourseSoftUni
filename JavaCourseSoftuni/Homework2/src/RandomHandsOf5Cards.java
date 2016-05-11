/**
 * Created by maria on 9/4/2015.
 */

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
public class RandomHandsOf5Cards {
    private static Random rnd = new Random();
    public static void main(String[] args) {

        String[] faces = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = new String[]{"?", "?", "?", "?"};

        HashSet<String> result = new HashSet<String>();
        Scanner scanner = new Scanner(System.in);
        int numberOfHands = scanner.nextInt();
        for (int i = 0; i < numberOfHands; i++) {
             result =  generateCard(faces, suits);
            for (String s : result) {
                System.out.print(s);
            }
            System.out.println();
        }

    }

    public static HashSet<String> generateCard(String[] faces, String[] suits) {

        HashSet<String> hand = new HashSet<String>();
        String card = "";
        for (int i = 0; i < 5; i++) {
            card = generateFace(faces)+generateSuit(suits);
           while(hand.contains(card)){
               card = generateFace(faces)+generateSuit(suits);
           }
            hand.add(card);

        }
        return hand;
    }

    public static String generateSuit(String[] suits) {
        return suits[rnd.nextInt(suits.length)];
    }

    public static String generateFace(String [] faces ){
        return faces[rnd.nextInt(faces.length)];
    }
}
