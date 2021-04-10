import java.util.Scanner;

public class FindUnionAndIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of 1st Array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter number of 2nd Array: ");
        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
        int c[]=new int[n];
        int p=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i]==b[j])
                {
                    c[p]=a[i];
                    p++;
                }
            }
        }
        System.out.println("Intersecton  : ");
        for(int i:c)
        {
            if(i>0)
            {
                System.out.print(i+"  ");
            }
           
        }
        int q=0;
        int d[]=new int[n+m];
        for(int i=0;i<m;i++)
        {
            d[i]=b[i];
            q=i;
        }
        q=q+1;
        
        for(int i=0;i<n;i++)
        {
            boolean t=true;
            for(int j=0;j<m;j++)
            {
                if(a[i]==b[j])
                {
                    t=false;
                }
            }
            if(t)
            {
                d[q]=a[i];
                q++;
            }
        }
        System.out.println();
        System.out.println("Union is: ");
        for(int i:d)
        {
            if(i>0)
            {
                System.out.print(i+"  ");
            }
           
        }

    }
    
}
