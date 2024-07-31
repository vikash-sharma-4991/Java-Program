import java.util.Scanner;

class Calculator 
{
    public static void main(String[] args) 
    {
        int n1,n2,ch,cal;
        System.out.println("Enter Two Number");
        Scanner r=new Scanner(System.in);
        n1=r.nextInt();
        n2=r.nextInt();
        System.out.println("Select Option");
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Substraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        System.out.println("Don't Enter for Remainder");
        ch=r.nextInt();
        if (ch==1) 
        {
            cal=n1+n2;
            System.out.println("Addition="+cal);
        }
        else if (ch==2) 
        {
            cal=n1-n2;
            System.out.println("Substraction="+cal);
        }
        else if (ch==3) 
        {
            cal=n1*n2;
            System.out.println("Multiplication="+cal);
        }
        else if (ch==4) 
        {
            cal=n1/n2;
            System.out.println("Division="+cal);
        }
        else 
        {
            cal=n1%n2;
            System.out.println("Remainder="+cal);
        }
    }
}
