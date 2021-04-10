import java.util.Scanner;

public class CommonElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers of 1 st Array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter Numbers of 2ndArray: ");
        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter Numbers of 3rdArray: ");
        int p=sc.nextInt();
        int c[]=new int[p];
        for(int i=0;i<p;i++){
            c[i]=sc.nextInt();
        }

        int d[]=new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i] == b[j])
                {
                    
                }
            }
        }
    }
    
}
