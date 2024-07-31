import java.util.Scanner;

class Weekend 
{
    public static void main(String[] args) 
    {
        int n;
        System.err.println("Enter any number 0 to 6");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        switch (n) {
            case 0:System.out.println("Sunday");
            break;
            case 1:System.out.println("Monday");
            break;
            case 2:System.out.println("Tuesday");
            break;
            case 3:System.out.println("Wednesday");
            break;
            case 4:System.out.println("Thursday");
            break;
            case 5:System.out.println("Friday");
            break;
            case 6:System.out.println("Saturday");
            break;
            default:System.out.println("Invalid Code");
            break;
        }

    }
}
