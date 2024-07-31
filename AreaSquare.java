import java.util.Scanner;

class AreaSquare 
{
    public static void main(String[] args) 
    {
        int a,Area;
        System.out.println("Enter the length of Square");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        Area=a*a;
        System.out.println("Area of Square="+Area);
    }
}
