class patient
{
String s;
float f,h;
patient()
{
s = "haasitha";
f = 58.4f;
h = 5.6f;
}
patient(String v,float e,float g)
{
s=v;
f=e;
h=g;
}
double bmi()
{
double bmi=0;
bmi=(f/(h*h))*703;
return bmi;
}
}
class Patients{
public static void main(String args[])
{
double r,re;
patient p = new patient();
patient p1 = new patient("padma",60.0f,5.5f);
r=p.bmi();
re=p1.bmi();
System.out.println("Patient name:"+p.s);
System.out.println("bmi:"+r);
System.out.println("Patient name:"+p1.s);
System.out.println("bmi:"+re);
}
}

