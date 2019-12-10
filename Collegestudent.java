class Collegestudent extends student
{
static int year=2019;
static String major="cse";
public static void main(String args[])
{
student s = new student();
s.disp();
System.out.println("year:"+year);
System.out.println("major:"+major);
}
}