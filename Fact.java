import java.util.Scanner;

class Fact 
{
    public static void main(String[] args) 
    {
        int n,i,fact=1;
        System.out.println("Enter any number");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial="+fact);
    }
}
