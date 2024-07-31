import java.util.Scanner;

class Swapping 
{
    public static void main(String[] args) 
    {
        int a,b,temp;
        System.out.println("Enter Two Numbers");
        Scanner r=new Scanner(System.in);
        a=r.nextInt(); /*a=20 */
        b=r.nextInt();   /*b=10 */
        System.out.println("Before Swapping a="+a+"  b="+b);
        a=a+b;  /*a=20+10=30 */
        b=a-b;  /*b=30-10 =20*/
        a=a-b;   /*a=30-20 =10*/
        System.out.println("After Swapping a="+a+"  b="+b);
    }
}
