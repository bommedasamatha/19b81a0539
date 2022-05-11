//https://codeforces.com/problemset/problem/1669/B
import java.util.*;
public class Main2
{
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
       }
       HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
       for(int i=0;i<n;i++)
            {
                if(hm.containsKey(arr[i]))
                {
                   hm.put(arr[i],hm.get(arr[i])+1);
                 }
                else
                {
                     hm.put(arr[i],1);
                 }
            }
            TreeSet<Integer> ts=new TreeSet<Integer>();
           for(Map.Entry hmp:hm.entrySet())
           {
             int key=(int)hmp.getKey();
             int value=(int)hmp.getValue();
             if(value>=3)
             {
                 ts.add(key);
             }
           }
           if(ts.size()>=1)
           {
               System.out.println(ts.last());
           }
           else
           {
               System.out.println("-1");
           }
  }
   
}
}
