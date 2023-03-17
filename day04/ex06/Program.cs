class main
{
    static public string[] toArray(string str, char delimiter)
    {
        List<string> resultList = new List<string>();
        int startIndex = 0;
        int delimiterIndex = str.IndexOf(delimiter);
        while (delimiterIndex >= 0)
        {
            string substring = str.Substring(startIndex, delimiterIndex - startIndex);
            resultList.Add(substring);
            startIndex = delimiterIndex + 1;
            delimiterIndex = str.IndexOf(delimiter, startIndex);
        }
        if (startIndex < str.Length)
        {
            string substring = str.Substring(startIndex);
            resultList.Add(substring);
        }
        return resultList.ToArray();
    }

    static void Main(string[] args)
    {
        string myString = "Hello World !";
        char myDelimiter = ' ';
        string[] myArray = toArray(myString, myDelimiter);
        foreach (string s in myArray)
        {
            Console.WriteLine(s);
        }
    }
}
