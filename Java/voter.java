import java.io.*;
import java.util.*;
public class voter 
{    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input a number");
        int n=sc.nextInt();
        if(n>=18)
        System.out.println("You are Eligible for Vote");
        else
        System.out.println("You are not Eligible for Vote");
    }
}