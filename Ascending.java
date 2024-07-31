import java.util.Scanner;

class Ascending {
    public static void main(String[] args) {
        int a[]=new int[5];
        int temp;
        System.out.println("Enter the array element");
        Scanner r=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.println("Array Element");
        for(int i=0;i<5;i++)
        {
            System.out.print(a[i]+" ");
        }
        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if (a[i]>a[j]) 
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print("\n Ascending Order \n");
        for(int i=0;i<5;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
