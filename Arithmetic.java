// Arithmetic Operator
import java.util.Scanner;
class Arithmetic
{
    public static void main (String args[])
    {
        int a,b;
        System.out.println("Enter two numbers");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));
        System.out.println("a*b="+(a*b));
        System.out.println("a/b="+(a/b));
        System.out.println("a%b="+(a%b));

    }
}