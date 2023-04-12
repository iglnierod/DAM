package lunnaris;

import java.util.*;

public class Codewars {

    public static String reverseWords(final String original) {
        String[] array = original.split(" ");
        for(int i = 0; i < array.length; i++) {
            array[i] = new StringBuilder(array[i]).reverse().toString();
        }
        
        String result = "";
        
        for (int i = 0; i < array.length; i++) {
            result += array[i];
            if (i != array.length - 1)
                result += " ";
        }
        return result;
    }

    public static void main(String[] args) {


    }
}
