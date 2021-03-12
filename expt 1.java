import java.io.*;
import java.util.Scanner;
public class palindrome
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int r,s=0,t;/
t=n;
while(n>0)
{
r=n%10;
s=(s*10)+r;
n=n/10;
}
if(t==s)
  System.out.println(t);
}
}