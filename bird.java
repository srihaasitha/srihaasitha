class animal
{
void eat()
{
System.out.println("animal eating");
}
void sleep()
{
System.out.println("animal sleeping");
}
}
class bird extends animal
{
void eat()
{
System.out.println("bird eating");
}
void sleep()
{
System.out.println("bird sleeping");
}
void fly()
{
System.out.println("bird flying");
}
public static void main(String args[])
{
animal a = new animal();
bird b = new bird();
a.eat();
a.sleep();
b.eat();
b.sleep();
b.fly();
}
}


