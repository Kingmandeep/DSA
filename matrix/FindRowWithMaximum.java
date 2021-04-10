package matrix;

import java.util.Arrays;
import java.util.Scanner;

public class FindRowWithMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows and columns is: ");
        int r= sc.nextInt();
        int c=sc.nextInt();
        int a[][] = new int[r][c];
        int b[]=new int[r];
        int d[]=new int[r];
        
        for(int i=0;i<r;i++)
        {
            int sum=0;
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
                if(a[i][j] == 1)
                {
                    sum=sum+1;
                }
            }
            b[i]=sum;
            d[i]=sum;
            
        }
        Arrays.sort(b);
        for(int i=0;i<r;i++)
        {
            if(d[i] == b[r-1])
            {
                System.out.println(i);
            }
        }
    }
    
}
