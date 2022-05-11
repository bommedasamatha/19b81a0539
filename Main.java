//https://codeforces.com/contest/1676/submission/156842903
import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
        String str=sc.next();
        List<Character> al=new ArrayList<Character>();
        for(int i=0;i<6;i++)
        {
            al.add(str.charAt(i));
        }
        int s=0;
        for(int i=0;i<=2;i++)
        {
            int a=Integer.parseInt(String.valueOf(al.get(i)));
            s=s+a;
        }
      //  System.out.println(s);
        int m=0;
        for(int i=3;i<6;i++)
        {
            int b=Integer.parseInt(String.valueOf(al.get(i)));
            m=m+b;
        }
       // System.out.println(m);
        if(s==m)
        {
            System.out.println("YES");
        }
        else
        {
        System.out.println("NO");
        }
        }
    }
}