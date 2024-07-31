class demo{
    int a=10; String b="Vikash";
    void show(){
        System.out.println(a+" "+b);
    }
}
class classObject {
    public static void main(String[] args) {
        demo r=new demo();
        r.show();
    }
}
