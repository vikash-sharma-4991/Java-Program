// Constructor Overloading 

class A 
{
    int a; double b; String c;
    A()
    {
        a=15; b=89.5; c="Abhinash";
    }
    A(int x)
    {
        a=x;
    }
    A(double y, String z)
    {
        b=y; c=z;
    }
}
class ConsOver
{
    public static void main(String[] args) {
        A r=new A();
        A r2=new A(202);
        A r3=new A(12.5, "Vikash");
        System.out.println(r.a+" "+r.b+" "+r.c);
        System.out.println(r2.a);
        System.out.println(r3.b+" "+r3.c);
    }
}