using System;

class Program
{
    static string strcat(string s1, string s2)
    {
        char[] result = new char[s1.Length + s2.Length];
        int t = 0;

        for (int i = 0; i < s1.Length; i++, t++)
        {
            result[t] = s1[i];
        }

        for (int i = 0; i < s2.Length; i++, t++)
        {
            result[t] = s2[i];
        }

        return new string(result);
    }

    static void Main(string[] args)
    {
        string s1 = "Hello ";
        string s2 = "World";
        string s3 = strcat(s1, s2);
        Console.WriteLine(s3);
    }
}
