import java.io.*;
import java.util.*;
class p18
{
public static void main(String args[])
{
int m,i,sum=0,n;
Scanner s= new Scanner(System.in);
m = s.nextInt();
while(m > 0)
{
n = m % 10;
sum = sum + n;
m = m / 10;
}
System.out.println(sum);
}
}
