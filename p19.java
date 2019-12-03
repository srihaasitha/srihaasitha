import java.io.*;
import java.util.*;
class p19
{
public static void main(String args[])
{
int rows,number=0;
if(args.length==0)
System.out.print("please enter valid input");
else
{
rows=Integer.parseInt(args[0]);
for(int i = 1; i <= rows; i++)
{
for (int j = 1; j <= i; j++)
{ 
System.out.print("*" + " ");
number++;
}
System.out.println(); 
}
}
}
}


