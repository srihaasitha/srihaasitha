
class Teacher extends person
{
static int salary=10000;
static String sub="english";
public static void main(String args[])
{
person p =new person();
p.name();
System.out.println("salary:"+salary);
System.out.println("subject:"+sub);
}
}