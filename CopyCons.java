// Copy Constructor 


class A
{
    int a; String b;
    A()
    {
        a=12; b="VikashKumarSharma";
        System.out.println(a+" "+b);
    }
    A(A ref)
    {
        a=ref.a;
        b=ref.b;
        System.out.println(a+" "+b);
    }
}
class CopyCons
{
    public static void main(String[] args) {
        A r=new A();
        A r2=new A(r);
    }
}
