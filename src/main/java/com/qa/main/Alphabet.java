package com.qa.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Alphabet {
    private Map<String, Integer> alphabetMapToIndex;


    public Alphabet() {
        alphabetMapToIndex = new HashMap();
        int counter = 1;
        for (Character letter = 'A'; letter <= 'Z'; ++letter) {
            alphabetMapToIndex.put(String.valueOf(letter), counter);
            counter++;
        }
    }

    public String replaceLetterWithIndex(String input) {
        String result = "";
        String convertedInput = input.toUpperCase();

        Iterator it = alphabetMapToIndex.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            if (convertedInput.contains(entry.getKey().toString())) {
                System.out.print(entry.getKey().toString()+ " ");
                result += entry.getValue().toString() + " ";
            }
            it.remove();
        }



        return result;
    }




    public Map<String, Integer> getAlphabetMapToIndex() {
        return alphabetMapToIndex;
    }

    private void setAlphabetMapToIndex(Map<String, Integer> alphabetMapToIndex) {
        this.alphabetMapToIndex = alphabetMapToIndex;
    }

}
