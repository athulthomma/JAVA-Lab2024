import java.io.*;
import java.util.Scanner;

class oddoreven
{
 public static void main(String args[])throws IOException
{
Scanner ac=new Scanner(System.in);
System.out.println("enter a number");
int n=ac.nextInt();
if(n%2==0){
System.out.println("even number");
}
else
{
System.out.println("odd number");
}
}
}
