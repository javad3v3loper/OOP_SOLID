package L.goodexample;

public class Crow implements FlyingBird {
    @Override
    public void eat() {
        System.out.println("I am eating");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
