import java.util.Arrays;

class ArraysM {
    public static void main(String[] args) {
        String a[]={"Vikash","Abhinash","Archana"};
        System.out.println("toString()"+Arrays.toString(a));
        System.out.println("asList()"+Arrays.asList(a));
        int arr[][]={{10,20},{30,40}};
        System.out.println("deepToString()"+Arrays.deepToString(arr));
    }
}
