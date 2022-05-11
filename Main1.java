//https://codeforces.com/problemset/problem/1675/A
import java.util.*;
public class Main1
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        int c=sc.nextInt();
	        int x=sc.nextInt();
	        int y=sc.nextInt();
	        if((a+b+c)>=(x+y))
	        {
	            if((a>=x) && (b>=y))
	            {
	                System.out.println("Yes");
	            }
	            else if(((a<x) && ((x-a)<=c)) && (((x-a)+(y-b))<=c))
	            {
	                System.out.println("Yes");
	            }
	            else if( ((b<y) && ((y-b)<=c)) && (((x-a)+(y-b))<=c))
	            {
	                System.out.println("Yes");
	            }
	            else
	            {
	                 System.out.println("No");
	            }
	        }
	        else
	        {
	             System.out.println("No");
	        }
	    }
	
	}
}