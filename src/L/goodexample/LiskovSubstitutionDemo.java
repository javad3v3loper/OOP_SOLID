package L.goodexample;

/**
 *  Liskov substitution principle says:
 *  Object in a program should be replacable with instances
 *  of their subtypes without altering
 *  the correctness of that program
 */
public class LiskovSubstitutionDemo {
    public static void main(String[] args) {

        Bird[] birds = new Bird[] {new Crow(), new Sparrow(), new Ostrich()};
        for (Bird bird: birds) {
            bird.eat();
        }


        FlyingBird[] flyingBirds = new FlyingBird[] {new Crow(), new Sparrow()};
        for (FlyingBird flyingBird: flyingBirds) {
            flyingBird.fly();
        }
    }
}
