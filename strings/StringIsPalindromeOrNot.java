package strings;

import java.util.Scanner;

public class StringIsPalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String b=sc.next();
        String c="";
        String d="";
        for(int i=b.length()-1;i>=0;i--)
        {
            c=c+b.charAt(i);
        }
        int count=0;
        for(int i=0;i<b.length();i++)
        {
            if(c.charAt(i) == b.charAt(i))
            {
                count++;
            }
        }
        if(count==b.length())
        {
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
    
}
