import java.util.Scanner;

class AreaRectangle 
{
    public static void main(String[] args) 
    {
        int l,b,Area;
        System.out.println("Enter the length and breadth");
        Scanner r=new Scanner(System.in);
        l=r.nextInt();
        b=r.nextInt();
        Area=l*b;
        System.out.println("Area of Rectangle="+Area);
    }
}
