public class User
{
    private string name;
    private int age;

    public User(string name, int age)
    {
        this.name = name;
        this.age = age;
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
}
