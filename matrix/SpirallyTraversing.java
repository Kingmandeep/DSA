package matrix;

import java.util.Scanner;

public class SpirallyTraversing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Rows and Columns Number: ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][] = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int d=0,p=1,q=2;
        int i=0;
        int sum=r*c;
        while(sum>0)
        {
            for( i=0+d;i<c-d;i++)
            {
                System.out.print(a[d][i]+" ");
                sum--;
            }
           for(int j=1+d;j<r-d;j++)
            {
                System.out.print(a[j][c-p]+"  ");
                sum--;
            }    
           for(int  k=c-q;k>d;--k)
            {
                System.out.print(a[r-p][k]+"  ");
                sum--;
            }
            for(int l=r-p;l>d;--l)
            {
                System.out.print(a[l][d]+"  ");
                sum--;
            }
            d++;
            p++;
            q++;


        }
        
    }
    
}
