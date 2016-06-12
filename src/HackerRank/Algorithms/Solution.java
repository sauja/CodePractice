package HackerRank.Algorithms;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int width[] = new int[n];
        for (int i = 0; i < n; i++) {
            width[i] = in.nextInt();
        }
        for(int i=0;i<t;i++)
        test(in.nextInt(), in.nextInt(),n, width);

    }

    private static void test(int i, int j,int n,int width[]) {
        int vehicle=99;
        for(int k=i;k<=j;k++)
        {
            if(width[k]<vehicle)
                vehicle=width[k];
        }
        System.out.println(vehicle);
    }
}