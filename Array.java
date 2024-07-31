import java.util.Scanner;

class Array {
    public static void main(String[] args) {
        int size,i;
        System.out.println("Enter size of Array");
        Scanner r=new Scanner(System.in);
        size=r.nextInt();
        int a[]=new int[size];
        for(i=0;i<size;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.println("Printed Array Element");
        for(i=0;i<size;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}
