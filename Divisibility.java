import java.util.Scanner;

class Divisibility 
{
    public static void main(String[] args) 
    {
        int n;
        System.out.println("Enter any number");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        if (n%5==0) 
        {
            System.out.println(n+" is divisible by 5");
        }
        else
        {
            System.out.println(n+" is not divisible by 5");
        }
    }
}
