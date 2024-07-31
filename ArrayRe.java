import java.util.Scanner;

class ArrayRe {
    public static void main(String[] args) {
        int a[]=new int[5];
        System.out.println("Enetr Array Element");
        Scanner r=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.println("Array Elements ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Reverse Array Elements ");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
}
