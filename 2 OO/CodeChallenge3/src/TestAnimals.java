public class TestAnimals {

    public static void main(String[] args) {
        Fish f = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal b = new Spider();
        Pet p = new Cat();

        f.eat();
        c.eat();
        a.eat();
        b.eat();
        System.out.println();

        f.walk();
        c.walk();
        a.walk();
        b.walk();
        System.out.println();

        p.play();
        System.out.println(p.getName());
        p.setName("Ionutz");
        System.out.println(p.getName());


    }
}
