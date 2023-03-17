public class User
{
    private string name;
    private int age;
    private int id = 0;
    private int money = 0;
    static public int count = 0;

    public User()
    {
        this.name = "Vieux père";
        this.age = 85;
    }

    public User(string name, int age)
    {
        User.count++;
        this.name = name;
        this.age = age;
        this.id = User.count;
    }

    public string getName()
    {
        return name;
    }

    public void setName(string name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void generateMoney()
    {
        Random random = new Random();
        this.money += random.Next(0, 100);
    }

    public int getMoney()
    {
        return this.money;
    }

    public void display()
    {
        if (this.id == 0)
            Console.WriteLine("User " + this.id + " (default):");
        else
            Console.WriteLine("User " + this.id + ":");
        Console.WriteLine("Name: " + this.name);
        Console.WriteLine("Age: " + this.age);
        Console.WriteLine("Money: " + this.money);
        Console.WriteLine("--------------------");
    }

    public int nbUsers()
    {
        return User.count;
    }
}
