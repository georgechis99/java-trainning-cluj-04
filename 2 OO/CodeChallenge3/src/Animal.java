public abstract class Animal {

    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    abstract void eat();
    void walk(){
        System.out.println("Animal walks on " + legs + " legs.");
    }
}
