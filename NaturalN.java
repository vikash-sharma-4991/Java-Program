import java.util.Scanner;

class NaturalN 
{
    public static void main(String[] args) 
    {
        int n;
        System.out.println("Enter No. of term");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print(i+" ");
        }
    }
}
