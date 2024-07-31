import java.util.Scanner;

class CheckPN 
{
    public static void main(String[] args) 
    {
        int n;
        System.out.println("Enter any Number");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        if (n>0) 
        {
            System.out.println(n+" is positive number");
        }
        else if (n<0) 
        {
            System.out.println(n+" is negative number");
        }
        else
        {
            System.out.println(n+" is negative nor positive");
        }
    }
}
