import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by maria on 9/16/2015.
 */
public class MagicCard {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String handOfCards = in.nextLine();
        String[] handArray = handOfCards.split("\\s+");
        String position = in.nextLine();
        String magicCard = in.nextLine();

        int sum = 0; // to accumulate the sum of all cards

        for (int i = 0; i < handArray.length; i++) {
            String card = handArray[i];

            if (i % 2 == 0){
                if (position.equals("even")){


                    sum += calculateSum(card, magicCard);
                }
                else{
                    continue;
                }

             }
            else{
                if (position.equals("odd")){


                    sum += calculateSum(card, magicCard);
                }
                else {
                    continue;
                }
            }
        }
        System.out.println(sum);
    }
    private static int calculateSum(String cardString, String magicCard){
        String value = cardString.substring(0, cardString.length() - 1);
        int valueAsInt = getCardValue(value);

        String cardFace = cardString.substring(0, cardString.length()-1);
        String magicCardFace = magicCard.substring(0, magicCard.length()-1);
        String cardSuit = cardString.substring(cardString.length()-1, cardString.length());
        String magicCardSuit = magicCard.substring(magicCard.length() - 1, magicCard.length());

        if  (cardFace.equals(magicCardFace)){
            return valueAsInt * 10 * 3;
        }


        if (cardSuit.equals(magicCardSuit)){
            return valueAsInt * 10 * 2;
        }

        return valueAsInt * 10;

    }


    public static int getCardValue(String cardValue) {
        int valueAsInt = 0;
        switch (cardValue) {
            case "J":
                return 12;
            case "Q":
                return 13;
            case "K":
                return 14;
            case "A":
                return 15;

            default:
                return Integer.parseInt(cardValue);
        }

    }
}