import java.io.*;
class calculator
{
static double powerInt(int num1,int num2)
{
double r=0;
r=Math.pow(num1,num2);
return r;
}
static double powerDouble(double num1,double num2)
{
double r=0;
r=Math.pow(num1,num2);
return r;
}
}
class p2
{
public static void main(String args[])
{
double a,b;
a=calculator.powerInt(10,20);
b=calculator.powerDouble(10d,20d);
System.out.println(a);
System.out.println(b);
}
}

