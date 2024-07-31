//Addition of array element
import java.util.Scanner;

class AddArray {
    public static void main(String[] args) {
        int a[]=new int[5];
        int sum=0;
        System.out.println("Enter Elements in Array");
        Scanner r=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.println("Array Element");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
            sum=a[i]+sum;
        }
        System.out.println("\n Addition of Array Element="+sum);
    }
}
