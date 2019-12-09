import java.io.*;
class Box
{
double a,b,c;
Box(double i,double j,double k)
{
a=i;
b=j;
c=k;
}
double volume()
{
double volume=0;
volume=a*b*c;
return volume;
}
public static void main(String args[])
{
double res;
Box b = new Box(10d,20d,30d);
res=b.volume();
System.out.println(res);
}
}



