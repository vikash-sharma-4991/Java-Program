import java.util.Scanner;

class CheckVC 
{
    public static void main(String[] args) 
    {
        char ch;
        System.out.println("Enter any Character");
        Scanner r=new Scanner(System.in);
        ch=r.next().charAt(0);
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}
