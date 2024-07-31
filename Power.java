import java.util.Scanner;

class Power
{
    public static void main(String[] args) 
    {
        int n, p, result=1;
        System.out.println("Enter the number");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        System.out.println("Enter the power");  
        p=r.nextInt();
        for(int i=1;i<=p;i++)
        {
            result=n*result;
        } 
        System.out.println(result);  
    }
}
