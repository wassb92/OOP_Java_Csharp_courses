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

    static bool isPalindrome(string str)
    {
        string reversed = reverse(str);
        return str == reversed;
    }

    static void Main()
    {
        System.Console.WriteLine(isPalindrome("laval"));
        System.Console.WriteLine(isPalindrome("hello"));
    }
}
