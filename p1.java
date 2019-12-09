import java.io.*;
import java.util.*;
import java.lang.*;
class p1
{
public static void main(String args[])
{
int sum=0,avg=0;
int [] a = new int[]{1,2,3,4,5};
for(int i=0;i<5;i++)
{
sum+=a[i];
}
avg=(sum)/5;
System.out.println("sum is:"+sum);
System.out.println("average is:"+avg);
}
}

