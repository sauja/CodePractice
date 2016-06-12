package HackerRank.Algorithms;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++)
            test(in.nextInt(),in.nextInt(),in.nextInt());


    }

    private static void test(int n,int c,int m) {
        int totalChocolates=n/c;
        int w=n/c;
        while(Math.floor(w/m)!=0)
        { //System.out.println("1:"+totalChocolates+" "+w);
            totalChocolates+=w/m;
            int currWrappers=w/m;
            w=w%m+currWrappers;
            //System.out.println("2:"+totalChocolates+" "+w);
        }
        System.out.println(totalChocolates);
    }

}