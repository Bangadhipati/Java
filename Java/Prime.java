import java.util.*;
public class Prime 
{
    public static void main(String[] args) 
    {
        int n,c=0,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input a Number");
        n=sc.nextInt();
        for(i=2;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==1)
        System.err.println("Prime");
        else
        System.out.println("Not Prime");
    }
}