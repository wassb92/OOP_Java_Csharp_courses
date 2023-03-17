class main
{
    static string reverse(string str)
    {
        string reversed = "";
        for (int i = str.Length - 1; i >= 0; i--)
        {
            reversed += str[i];
        }
        return reversed;
    }

    static void Main()
    {
        string str = "Hello World";
        string strReversed = reverse(str);
        System.Console.WriteLine(strReversed);
    }
}
