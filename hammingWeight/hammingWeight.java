package org.example.hammingWeight;

public class hammingWeight {
    public int find1s(int n){
        int ans=0;
        while(n!=0){
            ans=ans+(n&1);
            n=n>>>1;
        }
        return ans;
    }
}