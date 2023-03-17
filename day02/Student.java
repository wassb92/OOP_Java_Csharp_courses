public class Student {

    private String name = null;
    private int energy = 0;

    public String[] sentences = {
            "Bonjour",
            "Comment allez-vous ?",
            "Je suis content de vous rencontrer",
            "Au revoir"
    };

    Student(String name) {
        this.name = name;
        System.out.println(name + " a hâte de rencontrer ses camarades !");
    }

    public void Talk() {
        this.energy -= 1;
        if (this.energy < 0) {
            this.energy = 0;
            System.out.println("[" + this.name + "]: Je n'ai plus d'énergie !");
            return;
        }
        int random = (int) (Math.random() * this.sentences.length);
        System.out.println("[" + this.name + "]: " + this.sentences[random]);
    }

    public void Eat() {
        this.energy += 5;
        if (this.energy > 100)
            this.energy = 100;
    }

    public static void main(String[] args) {
        Student student1 = new Student("John");
        Student student2 = new Student("Jane");
        Student student3 = new Student("Jack");
        student1.Eat();
        student2.Eat();
        student1.Talk();
        student2.Talk();
        student3.Talk();
        student1.Talk();
    }
}