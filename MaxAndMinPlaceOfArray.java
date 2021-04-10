import java.util.Scanner;

public class MaxAndMinPlaceOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int sum=a[0];
        int max=0;
        int sum2=a[0];
        int min=0;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    if(sum<a[j])
                    {
                        sum=a[j];
                        max=j;
                    }
                }
                if(a[i]>a[j])
                {
                    if(sum2>a[j])
                    {
                        sum2=a[j];
                        min=j;
                    }
                }

            }
        }
        System.out.println("Max "+"  "+"Min        places");
        System.out.println((max+1)+"   "+(min+1));
    }
    
}
