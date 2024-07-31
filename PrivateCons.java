// Private Constructor 
class PrivateCons 
{
    int a; double b; String c;
    private PrivateCons()
    {
        a=12; b=25.8; c="Vikash";
        System.out.println(a+" "+b+" "+c);
    }
    public static void main(String[] args) {
        PrivateCons r=new PrivateCons();
    }
}
