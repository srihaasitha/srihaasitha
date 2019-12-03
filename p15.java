import java.io.*;
import java.util.*;
class p15
{
public static void main(String args[])
{
int i,m;
Scanner s = new Scanner(System.in);
m=s.nextInt();
boolean flag = false;
for(i = 2; i <=m/2; ++i)
{
if(m % i == 0)
{
flag = true;
break;
}
}
if (!flag)
System.out.println("prime");
else
System.out.println("not prime");
}
}
