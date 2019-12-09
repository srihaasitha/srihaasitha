class author
{
private String n;
private String e;
private char g;
author()
{
n="haasitha";
e="haasitha@gmail.com";
g='f';
}
void setn(String n)
{
n="biopic";
}
void sete(String e)
{
e="haasitha";
}
void setg(char g)
{
g='f';
}
String getn()
{
return n;
}
String gete()
{
return e;
}
char getg()
{
return g;
}
}
class book
{
private String name;
private String author;
private int qty;
private double price;
book(String m,String a,int q,double p)
{
name=m;
author=a;
qty=q;
price=p;
}
void setname(String name)
{
name="biopic";
}
void setauthor(String author)
{
author="haasitha";
}
void setqty(int qty)
{
qty=4;
}
void setprice(double price)
{
price=1200;
}
String getname()
{
return name;
}
String getauthor()
{
return author;
}
int getqty()
{
return qty;
}
double getprice()
{
return price;
}
public static void main(String args[])
{
book b = new book("biopic","haasitha",4,1200);
author a = new author();
System.out.println("book class:");
System.out.println(b.getname());
System.out.println(b.getprice());
System.out.println(b.getqty());
System.out.println("Author class :");
System.out.println(a.getn());
System.out.println(a.gete());
System.out.println(a.getg());
}
}