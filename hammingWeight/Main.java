package org.example.hammingWeight;

public class Main {
    public static void main(String[] args) {
        int n=0001;
        int y=010101;
        hammingWeight hammingWeight = new hammingWeight();
        System.out.println(hammingWeight.find1s(n));
        System.out.println(hammingWeight.find1s(y));
    }
}