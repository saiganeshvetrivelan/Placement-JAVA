class teaching
{
    void dsa()
    {
        System.out.println("Teaching DSA");
    }
    void dsa(int a)
    {
        System.out.println("H");
    }
}
public class Method_overloading
{
    public static void main(String[] args)
    {
        teaching t = new teaching();
        t.dsa();
        t.dsa(5);
    }
}