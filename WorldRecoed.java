package DSA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class WorldRecoed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        float a[]=new float[4];
        double p=9.58;
        while(n--){
            float t=1;
            for(int i=0;i<4;i++){
                a[i]=sc.nextFloat();
                t=t*a[i];
            }
            t=100/t;
            DecimalFormat df=new DecimalFormat("#.00");
            t=Float.valueOf(df.format(t));
            double d=t;
            if(d<p){
                System.out.println("YES");
                p=d;
            }else{
                System.out.println("NO");
            }
        }
    }
    
}
