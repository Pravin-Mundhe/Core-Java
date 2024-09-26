public class PassingObjectsDemo
{
    int n;
    PassingObjectsDemo(int n)
    {
        this.n = n;
    }
    void display(PassingObjectsDemo obj)
    {
        System.out.println(obj.n);
    }
    static boolean equals(PassingObjectsDemo obj1, PassingObjectsDemo obj2)
    {
        if(obj1.n == obj2.n)
            return true;
        return false;
    }
    public static void main(String[] args)
    {
        PassingObjectsDemo s1 = new PassingObjectsDemo(10);
        PassingObjectsDemo s2 = new PassingObjectsDemo(20);
        s1.display(s1);
        s2.display(s2);
        if(equals(s1, s2))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}
