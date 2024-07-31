import java.util.Scanner;

class SumN
{
    public static void main(String[] args) 
    {
        int n,i,sum=0;
        System.out.println("Enter no. of Term");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Addition="+sum);
    }
}