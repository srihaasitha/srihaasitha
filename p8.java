import java.io.*;
import java.util.*;
import java.lang.*;
class p8{
public static void main(String args[])
{
int b,e,n,c=1,m=1,i;
Scanner s = new Scanner(System.in);
System.out.println("enter size");
e=s.nextInt();
int [] a = new int[e];
for(i=0;i<a.length;i++)
{
System.out.println("enter element");
b=s.nextInt();
a[i]=b;
}
Arrays.sort(a);
int r=a[0];
for(i=1;i<e;i++)
{
if(a[i]==a[i-1])
c++;
else
{
if(c>m)
{
m=c;
r=a[i-1];
}
c=1;
}
}
if(c>m)
{
m=c;
r=a[i-1];
}
System.out.println(r);
}
}



