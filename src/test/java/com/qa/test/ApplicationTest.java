package com.qa.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class ApplicationTest {
    Map<String, Integer> alphabetMapToIndex;
    @Before
    public void setup() {

        alphabetMapToIndex = new HashMap();
        int counter = 1;
        for (Character letter = 'A'; letter <= 'Z'; ++letter) {
            alphabetMapToIndex.put(String.valueOf(letter), counter);
            counter++;
        }
//        Iterator it = alphabetMapToIndex.entrySet().iterator();
//        while (it.hasNext()) {
//            Map.Entry entry = (Map.Entry)it.next();
//            System.out.println(entry.getKey() + " = " + entry.getValue());
//            it.remove();
//        }
    }
    @After
    public void tearDown() {

    }

    @Test
    public void testApplication() {

        String testValue = "Hello World!";
        assertEquals("8 5 12 12 15 23 15 18 12 4",replaceLetterWithIndex(testValue));
    }
}
