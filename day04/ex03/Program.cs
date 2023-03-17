using System;

class Program
{
    static void Main(string[] args)
    {
        if (args.Length < 1)
        {
            Console.WriteLine("Usage: dotnet run <number>");
            return;
        }
        string input = args[0];
        int nb = 0;
        try
        {
            nb = int.Parse(input);
        }
        catch (Exception e)
        {
            Console.WriteLine("Error: " + e.Message);
            return;
        }
        int number = nb * nb;

        Console.WriteLine(nb + " au carré est égal à " + number);
    }
}
