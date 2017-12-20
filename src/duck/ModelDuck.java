package duck;

import duck.fly.implement_fly.FlyNoWay;
import duck.quack.implement_quack_behaviour.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    public void display() {
        System.out.println("I am a model duck");
    }
}
