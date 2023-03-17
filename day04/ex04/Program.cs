using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        if (args.Length < 1)
        {
            Console.WriteLine("Usage: dotnet run <filename>");
            return;
        }

        string filename = args[0];
        if (!File.Exists(filename))
        {
            Console.WriteLine($"Error: File {filename} not found.");
            return;
        }
        try
        {
            string[] lines = File.ReadAllLines(filename);

            foreach (string line in lines)
                Console.WriteLine(line);
        }
        catch (Exception e)
        {
            Console.WriteLine("Error: " + e.Message);
        }
    }
}
