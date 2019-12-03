import java.io.*;
import java.util.*;
class p16
{
public static void main(String args[])
{
int n=0,i;
String p = "";
for (i = 10; i <= 99; i++)         
{ 		  	  
int c=0; 	  
for(n =i; n>=1; n--)
{
if(i%n==0)
{
c = c + 1;
}
}
if (c==2)
{
p= p+ i + " ";
}	
}	
System.out.println(p);
}
}
