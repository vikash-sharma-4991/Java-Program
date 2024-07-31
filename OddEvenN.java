import java.util.Scanner;

class OddEvenN 
{
    public static void main(String[] args) 
    {
        int n,i,m,j;
        System.out.println("Enter the Range For Odd & Even Number");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        m=r.nextInt();
        System.out.println("Odd Number is :-");
        for(i=1;i<=n;i=i+2)
        {
            System.out.println(i);
        }
        System.out.println("Even Number is :-");
        for(j=2;j<=m;j=j+2)
        {
            System.out.println(j);
        }
    }
}
