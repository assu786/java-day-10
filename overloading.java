class a
{
    static void a()
    {
        System.out.println("hello");
    }
    static void a(int n)
    {
        System.out.println("hello"+ " "+n);
    }
    static void a(int n,int m,String h)
    {
        System.out.println("hello"+ " "+n + " "+m + " "+h);
    }
    public static void main(String args[])
    {
        a();
        a(7);
        a(7,8,"hii");
    }
}