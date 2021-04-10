import java.util.Scanner;

public class CyclicallyRotate {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter number of rotation: ");
        int m=sc.nextInt();
        for(int i=0;i<m-1;i++)
        {
            int t=a[0];
            for(int j=0;j<n-1;j++)
            {
                a[j]=a[j+1];
            }
            a[n-1]=t;
            
           
        }
        System.out.println();
        System.out.println("After Rotation is: ");
        for(int p:a)
            {
                System.out.print(p+" ");
            }
    }
}
