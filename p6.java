import java.io.*;
import java.util.*;
import java.lang.*;
class p6
{
public static void main(String args[])
{
int b,e,t,i,j;
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
for(i=0;i<a.length;i++)
{
for(j=i+1;j<a.length;j++)
{
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
System.out.println("sorted array:");
for(i=0;i<a.length;i++)
System.out.println(a[i]);

}
}
