package HackerRank.Algorithms;

import java.util.Scanner;

public class Sherlock {

}
/*
 
 import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    		Scanner in=new Scanner(System.in);
    		int n=in.nextInt();
    		
    		for(int i=0;i<n;i++)
    		{
    			test(in.nextInt());
    		}
        
    }
private static void test(int n)
{
	
    char str[]=new char[n];
    for(int i=0;i<n;i++)
    {
        str[i]='5';
        //System.out.print((str[i]));
    }

    for(int i=n-1;i>=0;i--)
    {
        if(splitNCount(str))
        {
        	
            break;
        }
        str[i]='3';
    }
    
    if(splitNCount(str))
    	System.out.println(str);
    else
    	System.out.println("-1");
}
    private static boolean splitNCount(char[] str)
    {
        int cnt3=0,cnt5=0;
        for(char ch:str)
        {
            if(ch=='5')
                cnt5++;
            else if(ch=='3')
                cnt3++;
        }
        if(cnt5%3==0&&cnt3%5==0)
            return true;
        return false;
    }
}

*/