package matrix;

import java.util.Scanner;

public class SearchAnElementInAMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and coloumns number:");
        int r= sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Enter search element: ");
        int t=sc.nextInt();
        int a[][] = new int[r][c];
        boolean result=false;
        System.out.println("Enter martrix: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
                if(t==a[i][j])
                {
                    result=true;
                }
            }
        }
        if(result)
        {
            System.out.println("True");
        }else{
            System.out.println("False");
        }


    }
    
}
