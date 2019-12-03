import java.io.*;
import java.util.*;
class p23
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
int h;
char choice;
System.out.println("1.Add");
System.out.println("2.Sub");
h=s.nextInt(); 
do
{
if(h==1)
{
int  v,l;      
int  sum = 0;    
System.out.print("Enter integers: ");
v=s.nextInt();
l=s.nextInt();
sum = v+l;
System.out.println("Sum of the integers: " + sum);
}
else if(h==2){
int  v,l;      
int  sub = 0;    
System.out.print("Enter integers: ");
v=s.nextInt();
l=s.nextInt();
sub = v-l;
System.out.println("Substraction of the integers: " + sub);
}
else
System.out.println("Select valid operation");
System.out.println("To continue..");
System.out.println("Enter Y for yes or N for no: ");
choice = s.next().charAt(0);
}while ((choice == 'y') || (choice == 'Y'));
}
}


