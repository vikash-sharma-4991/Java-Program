import java.util.Scanner;

class ifElse
{
    public static void main(String[] args) 
    {
        int n;
        System.out.println("Enter the number");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        if (n>=0) 
        {
            System.out.println("Positive Number");
        }
        else
        {
            System.out.println("Negative Number");
        }
    }
}
