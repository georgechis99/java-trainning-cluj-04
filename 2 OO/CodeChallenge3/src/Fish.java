public class Fish extends Animal{

    protected Fish() {
        super(0);
    }

    @Override
    void eat() {
        System.out.println("Fish is eating.");
    }

    @Override
    void walk() {
        System.out.println("Fishes can't walk...");
    }
}
