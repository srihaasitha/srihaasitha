import java.io.*;
import java.util.*;
class p17
{
public static void main(String args[])
{
int i;
boolean flag= false;
if(args.length==0)
{
System.out.println("Please enter an integer number");
}
else{
int j=Integer.parseInt(args[0]);
if(j==1||j==0)
{
System.out.println(j+"is neither prime nor composite");
}
else{
for(i = 2; i <=j/2; ++i)
{
if(j % i == 0)
{
flag = true;
break;
}
}

if (!flag)
System.out.println(j+"is a prime");
else
System.out.println(j+"is not a prime");
}
}
}
}
