import java.util.*;

public class MaxAndMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        //Arrays.sort(a);   it is also used for sorting 
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[j]>a[i])
                {
                    int t=a[j];
                    a[j]=a[i];
                    a[i]=t;
                }
            }
        }
        System.out.println("min is: "+a[0]+"           max is: "+   a[n-1]);
    }
    
}
