import java.util.Scanner;

class Swap 
{
    public static void main(String[] args) 
    {
        int a,b,temp;
        System.out.println("Enter Two Numbers");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        System.out.println("Before Swapping a="+a+"  b="+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping a="+a+"  b="+b);
    }
}
