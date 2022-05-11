import java.util.*;
//https://codeforces.com/problemset/problem/1560/A
public class Solution{
    public static void main(String aargs[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int k=sc.nextInt();
            int n=1;
            int c=0;
            while(k!=c)
            {
                if(n%3!=0 && n%10!=3 )
                c++;
                n++;
            }
            System.out.println(n-1);
        }
    }
}