package matrix;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElementInARowColumnWiseSortedMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[][] =new int[n][n];
        int b[]=new int[n*n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        int p=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[p]=a[i][j];
                p++;
            }
        }
        Arrays.sort(b);
        System.out.println("Enter Position of elements: ");
        int t=sc.nextInt();
        System.out.println("Element is: ");
        System.out.print(b[t-1]);

        
    }
}
