import java.util.Arrays;
import java.util.Scanner;

public class MergeWithoutExtraSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of 1st Array: ");
        int n= sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.println("Enter number of 2nd Array: ");
        int m= sc.nextInt();
        int b[] = new int[m];
        for(int i=0;i<m;i++)
        {
            b[i]= sc.nextInt();
        }
        int c[]= new int[n+m];
        int i=0;
        
        for( i=0;i<n;i++)
        {
            c[i]=a[i];
        }
       

         int t=n;
        for(i=0;i<m;i++)
        {
            c[t]=b[i];
            t++;
        }
        Arrays.sort(c);
        for(int p:c)
        {
            System.out.print(p+" ");
        }
    }
    
}
