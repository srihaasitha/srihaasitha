class employee extends person
{
double annualsalary;
int eyear;
String insurancenum;
employee()
{
annualsalary=100000d;
eyear=2022;
insurancenum="veha1618";
}
void disp()
{
System.out.println("annual salary of employee:"+annualsalary);
System.out.println("start year of employee:"+eyear);
System.out.println("insurance number of employee:"+insurancenum);
}
}