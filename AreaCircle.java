import java.util.Scanner;

class AreaCircle 
{
    public static void main(String[] args) 
    {
        int r;
        double Area;
        System.out.println("Enter the radius of circle");
        Scanner ref=new Scanner(System.in);
        r=ref.nextInt();
        Area=(22*r*r)/7;
        System.out.println("Area of Circle="+Area);
    }
}
