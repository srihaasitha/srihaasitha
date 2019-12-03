import java.io.*;
import java.util.*;
class p22
{
static void t(int N) 
{      
for (int num = 0; num < N; num++) 
{        
if (num % 3 == 0 && num % 5 == 0) 
System.out.print(num + " "); 
} 
} 
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
int n=s.nextInt();
t(n);
}
}
