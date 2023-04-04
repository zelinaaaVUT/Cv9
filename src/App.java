public class App {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Petr", "petr@vutbr.cz", new char[]{'p', 'e','t', 'r'});
        Employee employee2 = new Employee("Tomáš", "tomas@vutbr.cz", new char[]{'t', 'o','m'});
        Employee employee3 = new Employee("Adam", "adam@vutbr.cz", new char[]{'a', 'd','a', 'm'});
        Employee employee4 = new Employee("Eva", "eva@vutbr.cz", new char[]{'e', 'v','a'});
        Employee employee5 = new Employee("Norbert", "norbert@vutbr.cz", new char[]{'n', 'o','r', 'd'});

        Manager manager1 = new Manager("Boss", "boss@vutbr.cz", new char[]{'b', 'o', 's', 's'});

        Secretarian secretarian1 = new Secretarian("Anežka", "anezka@vutbr.cz", new char[]{'a', 'n', 'e'});
        Secretarian secretarian2 = new Secretarian("Veronika", "veronika@vutbr.cz", new char[]{'v', 'e', 'r'});

        manager1.AddEmployee(employee1);
        manager1.AddEmployee(employee2);
        manager1.AddEmployee(employee3);
        manager1.AddEmployee(employee4);
        manager1.AddEmployee(employee5);
        manager1.AddRelation(secretarian1);


        manager1.printAllEmployess();
        manager1.printAllRelations();
        //System.out.println(employee1);

        Cat cat = new Cat((byte) 2);
        Dog dog = new Dog((byte) 2);
        Goat goat = new Goat((byte) 2);
        Pig pig = new Pig((byte) 2);
        Cow cow = new Cow((byte) 2);
        cat.sound();
        dog.sound();
        goat.sound();
        pig.sound();
        cow.sound();

        CatImpl catimpl = new CatImpl((byte) 2);
        DogImpl dogimpl = new DogImpl((byte) 2);
        CowImpl cowimpl = new CowImpl((byte) 2);
        GoatImpl goatimpl = new GoatImpl((byte) 2);
        PigImpl pigimpl = new PigImpl((byte) 2);
        catimpl.sound();
        dogimpl.sound();
        cowimpl.sound();
        goatimpl.sound();
        pigimpl.sound();
        catimpl.Save();
        dogimpl.Save();
        cowimpl.Save();
        pigimpl.Save();
        goatimpl.Save();
    }
}