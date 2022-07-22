package L.badexample;

public class Ostrich implements Bird{

    @Override
    public void eat() {
        System.out.println("I am eating...");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("I can't fly...");
    }
}
