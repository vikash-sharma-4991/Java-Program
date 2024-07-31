class B
{
static int a=10; //static variable
int b=20; //instaance variable
public static void main (String args[])
{
int c=30; // local variable
B ref=new B();
System.out.println(B.a);
System.out.println(c);
System.out.println(ref.b);
}
}
