import java.util.Scanner;

class elseIf
{
    public static void main(String[] args) 
    {
        int marks;
        System.out.println("Enter marks");
        Scanner ref=new Scanner(System.in);
        marks=ref.nextInt();
        if (marks>80) 
        {
            System.out.println("Topper");
        }
        else if (marks>=60 && marks<80) 
        {
            System.out.println("First Division");
        }
        else if (marks>=50 && marks<60) 
        {
            System.out.println("Second Division");
        }
        else if(marks>=33 && marks<50)
        {
            System.out.println("Third Division");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
