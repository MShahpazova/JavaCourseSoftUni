import com.sun.javafx.binding.StringFormatter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by maria on 9/14/2015.
 */
public class StuckNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] nums =  new int[n];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
             nums[i] = scanner.nextInt();
        }
        List<String> stuckNumbers = new ArrayList<String>();
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {
                if (j == i) {
                    continue;
                }
                for (int k = 0; k < nums.length; k++) {
                    if (k == j || k == i) {
                        continue;
                    }
                    for (int l = 0; l < nums.length; l++) {
                        if (l == k || l == j || l == i) {
                            continue;
                        }

                            String firstCouple = String.format("%s%s", nums[i], nums[j]);
                            String secondCouple = String.format("%s%s", nums[k], nums[l]);

                            if (firstCouple.equals(secondCouple)){
                                System.out.println(String.format("%s|%s==%s|%s",nums[i], nums[j], nums[k], nums[l]));
                                count ++;
//                                stuckNumbers.add(String.format("%s|%s==%s|%s",nums[i], nums[j], nums[k], nums[l]));
                            }

                    }
                }
                
            }
            
        }
//        if (stuckNumbers.isEmpty()){
//            System.out.println("No");
//        }
//        else {
//            stuckNumbers.forEach(num -> System.out.println(num));
//        }
        if (count == 0){
            System.out.println("No");
        }
    }
}
