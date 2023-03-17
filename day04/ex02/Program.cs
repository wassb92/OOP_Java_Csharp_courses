using System;

class MainClass
{
    static void Main()
    {
        Console.Write("Entrez un mot : ");
        string mot = Console.ReadLine() ?? "";
        Console.Write("Entrez un age : ");
        int age = 0;

        try
        {
            age = int.Parse(Console.ReadLine() ?? "0");
        }
        catch (Exception e)
        {
            Console.WriteLine("Error: " + e.Message);
            return;
        }

        Console.WriteLine("En majuscules : " + mot.ToUpper());
        Console.WriteLine("En minuscules : " + mot.ToLower());
        if (age > 18)
            Console.WriteLine("Vous êtes majeur");
        else
            Console.WriteLine("Vous êtes mineur");
    }
}
