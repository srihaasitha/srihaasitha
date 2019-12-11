class fruit
{
String name;
String taste;
int size;
void eat(String a,String b)
{
name=a;
taste=b;
System.out.println("fruit name:"+name);
System.out.println("fruit taste:"+taste);
}
}
class apple extends fruit
{
void eat(String a,String b)
{
name=a;
taste=b;
System.out.println("fruit name:"+name);
System.out.println("fruit taste:"+taste);
}
}
class orange extends fruit
{
void eat(String a,String b)
{
name=a;
taste=b;
System.out.println("fruit name:"+name);
System.out.println("fruit taste:"+taste);
}
}
class p1
{
public static void main(String args[])
{
apple a = new apple();
orange o = new orange();
a.eat("apple","sour");
o.eat("orange","sweet");
}
}