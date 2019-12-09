import java.io.*;
import java.util.*;
import java.lang.*;
class p2
{
public static void main(String args[])
{
int min,max;
int [] a = new int[]{1,2,3,4,5};
min=a[0];
max=a[0];
for(int i=0;i<5;i++)
{
if(min>a[i])
min=a[i];
if(a[i]>max)
max=a[i];
}
System.out.println("min is:"+min);
System.out.println("max is:"+max);
}
}
