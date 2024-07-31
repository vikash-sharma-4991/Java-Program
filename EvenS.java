import java.util.Scanner;

class EvenS 
{
    public static void main(String[] args) 
    {
        int n,i,sum=0;
        System.out.println("Enter the no of term");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(i=2;i<=n;i=i+2)
        {
            sum=sum+i;
            System.out.println(i);
        }
        System.out.println("sum="+sum);
    }
}
