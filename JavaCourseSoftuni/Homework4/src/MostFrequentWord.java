import java.util.*;


public class MostFrequentWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String splitPattern = "[^A-Za-z]";
        String [] sentence = scanner.nextLine().toLowerCase().split(splitPattern);
        List<String> words = new ArrayList<String>(Arrays.asList(sentence));
        words.removeAll(Arrays.asList("", null));

        Map<String, Integer> orderedWords = new HashMap<>();


        for (String word : words) {
                if ( !orderedWords.containsKey(word)){
                    orderedWords.put(word, 1);
            }
            else  {
                    orderedWords.put(word, orderedWords.get(word) + 1);

                  }
        }
//        for (Map.Entry <String, Integer> entry : orderedWords.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
        SortedSet<Map.Entry<String, Integer>> sorted = sortEntriesByValue(orderedWords);
        List<Map.Entry<String, Integer>> res = new ArrayList<>();
        Iterator<Map.Entry<String, Integer>> iterator = sorted.iterator();
        res.add(iterator.next());
        while (iterator.hasNext()){
            Map.Entry<String, Integer> currentEntry = iterator.next();
            if (res.get(0).getValue() == currentEntry.getValue()) {
                res.add(currentEntry);
            }
        }

        res.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        for (Map.Entry<String, Integer> stringIntegerEntry : res) {
            System.out.print(stringIntegerEntry.getKey()+" -> ");
            System.out.print(stringIntegerEntry.getValue() + " times" + "\n");
        }
    }

    // Where T: IComparable<T>
    static <K,V extends Comparable<? super V>>
    SortedSet<Map.Entry<K,V>> sortEntriesByValue(Map<K,V> map) {
        SortedSet<Map.Entry<K,V>> sortedEntries = new TreeSet<Map.Entry<K,V>>(
                new Comparator<Map.Entry<K,V>>() {
                    @Override public int compare(Map.Entry<K,V> e1, Map.Entry<K,V> e2) {
                        int res = e2.getValue().compareTo(e1.getValue());
                        return res != 0 ? res : 1;
                    }
                }
        );
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }
}
