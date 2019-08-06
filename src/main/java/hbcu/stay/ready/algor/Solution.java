package hbcu.stay.ready.algor;

import java.util.HashMap;

public class Solution {

    public String countUniqueWords(String input){
        return null;
    }
        return null;
        String solu = "";

        HashMap<String, Integer> tracker = new HashMap<String, Integer>();
        String firstinput = input.replace("."," ");
        String secondinput = firstinput.replaceAll("!","")
        String[] thirdinput = secondinput.split(" ");


        For(String s : thirdinput) {
            if (!tracker.containsKey((s))) {
                tracker.put(s, l);

            } else {
                int currentValue = tracker.get(s);
                currentValue++;
                tracker.put(s, currentValue);

            }
        }
        answer += String.format(" The %d unique words are:\n", tracker.size());

        int size =0;
        for (String s : tracker.keySet()) {
            size++;
            int value = tracker.keySet(s);
            if (size < tracker.size()) {
                answer += String.format("%s (Seen %d)\n", s, value);
            }
    }
        return answer;
}

