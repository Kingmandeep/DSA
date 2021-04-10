package strings;

import java.util.Scanner;

public class DuplicateCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        String b="";
        
        for(int i=0;i<a.length();i++)
        {
            boolean t=true;
            for(int j=0;j<b.length();j++)
            {
                if(b.charAt(j)==a.charAt(i))
                {
                    t=false;
                }
            }
            if(t){
                b=b+a.charAt(i);
            }
        }
       ;
        int d[]=new int[b.length()];
        for(int i=0;i<b.length();i++)
        {
            int count=0;
            for(int j=0;j<a.length();j++)
            {
                if(b.charAt(i)==a.charAt(j))
                {
                    count+=1;
                }
            }
            d[i]=count;

        }
        for(int i=0;i<b.length();i++)
        {
            if(d[i]>1)
            {
                System.out.println(b.charAt(i)+"  "+d[i]);
            }
        }
    }
    
    
}
