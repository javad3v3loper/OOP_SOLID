package L.badexample;

public class Sparrow implements Bird{
    @Override
    public void eat() {
        System.out.println("I am eating");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
