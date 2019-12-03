import java.io.*;
import java.util.*;
class p9
{
public static void main(String args[])
{
int i = Integer.parseInt(args[1]);
if(args[0].equals("male")&& (i>=1&& i<=60))
System.out.println("Interest:9.2%");
else if(args[0].equals("male")&& (i>=61&& i<=120))
System.out.println("Interest:8.3%");
else if(args[0].equals("female")&& (i>=1&& i<=58))
System.out.println("Interest:8.2%");
else if(args[0].equals("female")&& (i>=59&& i<=120))
System.out.println("Interest:7.6%");
}
}
