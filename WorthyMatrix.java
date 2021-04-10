package DSA;

import java.util.Scanner;

public class WorthyMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
       while(n-->0){
           int r=sc.nextInt();
           int c=sc.nextInt();
           int k=sc.nextInt();
           int a[][] = new int[r][c];
           int val=0;
           for(int i=0;i<r;i++)
           {
               for(int j=0;j<c;j++)
               {
                   a[i][j]=sc.nextInt();
               }
           }
           int max;
           if(r>c){
               max=c;
           }else{
               max=r;
           }
           int l=0;
           while(l<max){
               l++;
               if(l==1){
                   for(int i=0;i<r;i++)
                   {
                       for(int j=0;j<c;j++)
                       {
                           if(a[i][j]>=k){
                               val=val+1;
                           }
                       }
                   }
               }else{
                   for(int  i=0;i<r;i++)
                   {
                       for(int j=0;j<c;j++)
                       {
                           long  sum=0;
                           for(int  kt=j;kt<j+1;kt++)
                           {
                               for(int p=i;p<i+1;p++)
                               {
                                   sum=sum+a[p][kt];
                               }
                           }
                           double avg=(double)sum/(l*l);
                           if(avg>=k){
                               val=val+c-l+1-j;
                               break;
                           }
                       }
                   }
               }
               System.out.println(val);
           }

       }
    }
    
}
