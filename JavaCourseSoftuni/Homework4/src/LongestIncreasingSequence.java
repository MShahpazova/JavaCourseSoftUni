import java.util.*;

public class LongestIncreasingSequence {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String[] numbers = scanner.nextLine().split(" ");
         int[]nums = Arrays.stream(numbers).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");

        }
        int sequenceCounter = 0;
          List<List<Integer>> sequences = new ArrayList<List<Integer>>();
        int currSeqIndex = 0;
        int maxSeq = 0;
        int maxSeqEndIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            List<Integer> sequence = new ArrayList<Integer>();
            sequence.add(nums[i]);
            for (int j = i + 1; j < numbers.length; j++) {
                if ( nums[j] > nums[j - 1]){
                    sequence.add(nums[j]);
                } else {
                    i = j + 1;
                    break;
                }
            }
            sequences.add(sequence);
        }
        sequences.sort(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                if (o1.size() > o2.size()){
                    return -1;
                }
                else if (o1.size() < o2.size())  {
                    return 1;
                }
                else  {
                    return 0;
                }
            }
        });
        for (List<Integer> sequence : sequences) {
            System.out.println(String.join(" ", sequence.toString().replace(']', '\0').replace('[', '\0')));
        }
        //System.out.println(sequences.get(0).toString().replace(']', '\0').replace('[', '\0'));
    }
}
