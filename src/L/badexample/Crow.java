package L.badexample;

public class Crow implements Bird{
    @Override
    public void eat() {
        System.out.println("I am eating");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
