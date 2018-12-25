package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement

        System.out.println("Word length from the given sentence is " + wordNLength);
        System.out.println("Largest word from the given sentence is " + largestWord(s));

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement

        String[] ac = wordGiven.split(" ");

        for (int i = 0; i < ac.length; i++) {
            map.put(ac[i].length(), ac[i]);
        }

        return map;
    }

    public static String largestWord(String givenWord) {
        DetermineLargestWord dt = new DetermineLargestWord();
        Map<Integer, String> wordNLength = dt.findTheLargestWord(givenWord);
        int largest = 0;
        String largeValue = "";
        for (Map.Entry<Integer, String> checkLength : wordNLength.entrySet()) {
            if (largest < checkLength.getKey()) {
                largest = checkLength.getKey();
                largeValue = checkLength.getValue();
            }
        }
        return largeValue;
    }
}
