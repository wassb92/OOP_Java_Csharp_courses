class main
{
    static void Display(string? message = null)
    {
        if (message == null)
        {
            System.Console.WriteLine("Vous n'avez pas entré de message");
        }
        else
        {
            System.Console.WriteLine(message);
        }
    }

    static void SayHello(string name = "John Doe")
    {
        System.Console.WriteLine("Hello {0}", name);
    }

    static void Main()
    {
        Display();
        Display("hello world");
        SayHello();
        SayHello("Bob");
    }
}
