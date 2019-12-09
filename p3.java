import java.io.*;
import java.util.*;
import java.lang.*;
class p3
{
public static void main(String args[])
{
int b,e=0,j=0;
Scanner s = new Scanner(System.in);
System.out.println("enter element to be checked");
b=s.nextInt();
int [] a = new int[]{1,2,3,4,5};
for(int i=0;i<a.length;i++)
{
if(a[i]==b){
e=i;
j=1;
}
}
if(j==1)
System.out.println(e+1);
else
System.out.println("-1");
}
}
