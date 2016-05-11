import java.util.Scanner;

/**
 * Created by maria on 9/1/2015.
 */
public class TheSmallestOfThreeNumbers
{
    public static int FindSmallest(int firstNum, int secondNum)
    {
        if (firstNum < secondNum){
            return firstNum;
        }
        else  return secondNum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int smallerNum = FindSmallest(a, b);
        int smallestOfThree = FindSmallest(smallerNum, c);
        System.out.println(smallestOfThree);
    }
}
