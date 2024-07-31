import java.util.Scanner;

class GreatT 
{
    public static void main(String[] args) 
    {
        int a,b,c;
        System.out.println("Enter the any three number");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        c=r.nextInt();
        if (a>b) 
        {
            if (a>c) 
            {
                System.out.println("a="+a+" is greatest number ");
            }
            else
            {
                System.out.println("c="+c+" is greatest number ");
            }
        }
        else
        {
            if (b>c) 
            {
                System.out.println("b="+b+" is greatest number ");
            }
            else
            {
                System.out.println("c="+c+" is greatest number ");
            }
        }
    }
}
