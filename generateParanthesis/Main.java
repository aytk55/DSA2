package org.example.generateParanthesis;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        int n=3;
        List<String> output=new ArrayList<>();
        backTrack(output,"",0,0,n);

        for(String value:output){
            System.out.println(value);
        }
    }
    public static void backTrack(List<String> output, String toAdd, int open, int close, int max){
        if(toAdd.length()==max*2){
            output.add(toAdd);

        }
        if(open<max){
            backTrack(output, toAdd+"(",open+1,close,max);
        }
        if(close<open){
            backTrack(output, toAdd+")",open,close+1,max);
        }


    }
}
