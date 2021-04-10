import java.util.Arrays;
import java.util.Scanner;

public class MinimiseTheMaximiseDifferenceBetweenHight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("k     and     n");
        int k=sc.nextInt();
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<2;i++)
        {
            a[i]=a[i]+k;
        }
        for(int i=2;i<n;i++)
        {
            a[i]=a[i]-k;
        }
        Arrays.sort(a);
        System.out.println("Minimise the maximum difference between height");
        System.out.println(a[n-1]-a[0]);
    }
    
}
