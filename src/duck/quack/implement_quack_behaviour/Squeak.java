package duck.quack.implement_quack_behaviour;

import duck.quack.QuackBehaviour;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("squeak");
    }
}
