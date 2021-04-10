package matrix;

import java.util.Arrays;
import java.util.Scanner;

public class FindMedianInARow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows And Columns Numbers : ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][] = new int[r][c];
        int b[]= new int[r*c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        int p=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                b[p]=a[i][j];
                p++;
            }
        }
        Arrays.sort(b);
        if(b.length%2==0)
        {
            System.out.println((b[b.length/2]+b[(b.length/2)-1])/2);

        }else{
            System.out.println(b[(b.length/2)]);
        }
        
    }
    
}
