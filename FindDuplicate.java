import java.util.Scanner;

public class FindDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            int t=a[i];
            
            for(int j=i+1;j<n;j++)
            {
                if(t==a[j])
                {
                    sum=t;
                }

            }
           
        }
        System.out.println(sum);
    }
    
}
