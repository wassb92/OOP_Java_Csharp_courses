using System;

class MainClass
{
    static void Main()
    {
        User user1 = new User("Alice", 25);
        User user2 = new User("Bob", 30);

        Console.WriteLine("User 1:");
        Console.WriteLine("Name: " + user1.getName());
        Console.WriteLine("Age: " + user1.getAge());

        Console.WriteLine("User 2:");
        Console.WriteLine("Name: " + user2.getName());
        Console.WriteLine("Age: " + user2.getAge());
    }
}
