import java.util.*;
public class Myclass 
{
    public static void main(String[] args) 
    {
        String str = "Hello, World!";
        int n=str.length();
        char[] ch = new char[n];
        for(int i=0;i<n;i++)
        {
            ch[i]=str.charAt(i);
        }
        ch[0] = 'M';
        String ans = new String(ch);
        System.out.println(ans);
    }
}
