package duck;

import duck.fly.implement_fly.FlyWithWings;
import duck.quack.implement_quack_behaviour.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    public void display(){
        System.out.println("I'm a mallard duck");
    }
}
