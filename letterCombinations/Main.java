package org.example.letterCombinations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String []args){
        HashMap<Character, String> hash = new HashMap<>();
        hash.put('2', "abc");
        hash.put('3', "def");
        hash.put('4', "ghi");
        hash.put('5', "jkl");
        hash.put('6', "mno");
        hash.put('7', "pqrs");
        hash.put('8', "tuv");
        hash.put('9', "wxyz");
        String digits="25";
        List<String > output=new ArrayList<>();
        backtrack(output,hash,"",digits,0);
        for(String x:output){
            System.out.println(x);
        }
    }
    public static void backtrack(List<String > output,HashMap<Character, String> hash,String toAdd,String digits,int index){
        if(toAdd.length()==digits.length()){
            output.add(toAdd);
            return;
        }
        char key=digits.charAt(index);
        String value=hash.get(key);

        for(char character:value.toCharArray()){
            backtrack(output,hash,toAdd+character,digits,index+1);
        }
    }
}
