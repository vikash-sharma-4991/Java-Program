//search array element

import java.util.Scanner;

class SearchArray {
    public static void main(String[] args) {
        int a[]=new int[5];
        int count=0,n;
        System.out.println("Enter the Element in Array");
        Scanner r=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.println("Array Element");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("\n Enter Search Element");
        n=r.nextInt();
        for(int i=0;i<a.length;i++)
        {
            if (a[i]==n) {
                count++;
            }
        }
        if (count>0) {
            System.out.println("Item found "+count+" times");
        }
        else
        {
            System.out.println("Item not found");
        }
    }
}
