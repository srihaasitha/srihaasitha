class shape
{
void draw()
{
System.out.println("Drawing shape");
}
void erase()
{
System.out.println("Erasing shape");
}
}
class circle extends shape
{
void draw()
{
System.out.println("Drawing circle");
}
void erase()
{
System.out.println("Erasing circle");
}
}
class triangle extends shape
{
void draw()
{
System.out.println("Drawing triangle");
}
void erase()
{
System.out.println("Erasing triangle");
}
}
class square extends shape
{
void draw()
{
System.out.println("Drawing square");
}
void erase()
{
System.out.println("Erasing square");
}
}
class p2
{
public static void main(String args[])
{
shape c = new circle();
shape t = new triangle();
shape s = new square();
c.draw();
c.erase();
t.draw();
t.erase();
s.draw();
s.erase();
}
}

