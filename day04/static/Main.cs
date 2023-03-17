using System;

class MainClass
{
    static void Main()
    {
        User user1 = new User("Alice", 25);
        User user2 = new User("Bob", 30);
        User user3 = new User();

        user1.display();
        user2.display();
        user1.display();
        user2.generateMoney();
        user2.generateMoney();
        user2.generateMoney();
        user2.generateMoney();
        user2.display();
        user3.display();
        user3.generateMoney();
        user3.display();


        Console.WriteLine("Nombre d'utilisateurs: " + User.count);
    }
}
