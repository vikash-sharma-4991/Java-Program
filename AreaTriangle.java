import java.util.Scanner;

class AreaTriangle 
{
    public static void main(String[] args) 
    {
        int base,height;
        double Area;
        System.out.println("Enter the base height of triangle");
        Scanner r=new Scanner(System.in);
        base=r.nextInt();
        height=r.nextInt();
        Area=(base*height)/2;
        System.out.println("Area of Triangle="+Area);
    }
}
