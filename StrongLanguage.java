package DSA ;
import java.util.Scanner;
public class StrongLanguage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            String s=sc.next();
            boolean t=false;
            int p=0;
            int i;
            for( i=0;i<a;i++)
            {
                if(s.charAt(i)=='*')
                {
                   p=p+1;
                }else{
                    p=0;
                }

                if(p>=b){
                    t=true;
                    break;
                }
            }
            if(i==n){
                t=false;
            }
            if(t){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
