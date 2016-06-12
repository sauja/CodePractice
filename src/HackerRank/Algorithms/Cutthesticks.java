package HackerRank.Algorithms;

/**
 * https://www.hackerrank.com/challenges/cut-the-sticks?h_r=next-challenge&h_v=zen
 */
public class Cutthesticks {
    /*

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int sticks[]=new int[n];
        for(int i=0;i<n;i++)
            sticks[i]=in.nextInt();
        test(n,sticks);

    }

    private static void test(int n,int sticks[]) {
        while(checkEmpty(n,sticks)==false)
        {
            int min=findMin(n,sticks);
            int count=0;
            for(int i=0;i<n;i++)
            {
                if(sticks[i]==0)
                    continue;
                sticks[i]-=min;
                count++;
            }
            System.out.println(count);
        }

    }
    private static boolean checkEmpty(int n,int sticks[])
    {
        for(int i=0;i<n;i++)
        {
            if(sticks[i]!=0)
                return false;
        }
        return true;
    }
    private static int findMin(int n,int sticks[])
    {
        int min=999999999;
        for(int i=0;i<n;i++)
        {
            if(sticks[i]==0)
                continue;
            if(sticks[i]<min)
                min=sticks[i];
        }
        return min;
    }

     */
}
