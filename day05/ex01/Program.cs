class main
{
    static void swap(ref int a, ref int b)
    {
        int tmp = a;
        a = b;
        b = tmp;
    }

    static void Main()
    {
        int a = 1;
        int b = 2;
        swap(ref a, ref b);
        System.Console.WriteLine("a = {0}, b = {1}", a, b);
    }
}
