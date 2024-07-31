import java.util.Scanner;

class AvgArray {
    public static void main(String[] args) {
        int a[]=new int[5];
        int sum=0;
        double avg;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter array elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.println("Array Element");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }
        for(int i=0;i<a.length;i++)
        {
            sum=a[i]+sum;
        }
        avg=sum/5.0;
        System.out.println("\n Addition="+sum+"\n Average="+avg);
    }
}
