import java.util.Scanner;

public class MoveAllNegativeElementToOneSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int j;
        for(int i=0;i<n;i++)
        {
            if(a[i]>0  && a[i+1]<0)
            {
                int t=a[i];
                for( j=i;j<n-1;j++)
                {
                    a[j]=a[j+1];
                    
                }
                a[j]=t;
                
            }
        }
        for(int i:a)
        {
            System.out.print(i+"  ");
        }
    }
    
}
