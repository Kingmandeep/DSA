package DSA;

import java.util.Scanner;

import jdk.internal.org.jline.terminal.Size;

public class Aba{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        int a[]=new int[4];
        int  i=0;
        while(n>0)
        {
            int rem=n%10;
            a[i]=rem;
            i++;
            n=n/10;
        }
        for(int i=0;i<4;i++)
        {
            System.out.println(a[i]);
        }
    }
}