import java.util.Scanner;

class MaxT 
{
    public static void main(String[] args) 
    {
        int a,b;
        System.out.println("Enter any Two Number");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        if (a>b) 
        {
            System.out.println(a+" is greater than "+b);
        }
        else
        {
            System.out.println(a+" is smaller than "+b);
        }
    }
}
