import java.util.Scanner;

class Switch
{
    public static void main(String[] args) 
    {
        int a=10,b=20,ch;
        System.out.println("Enter the User Choice...!");
        Scanner ref=new Scanner(System.in);
        ch=ref.nextInt();
        switch (ch) 
        {
            case 1: System.out.println("Sum"+(a+b));
            break;
            case 2:  System.out.println("Sub"+(a-b));
            break;
            case 3: System.out.println("Multi"+(a*b)); 
            break;
            case 4:  System.out.println("Div"+(a/b));
            break;
            default: System.out.println("Invalid Choice");
        }
    }
}
