package duck.fly.implement_fly;

import duck.fly.FlyBehaviour;

public class FlyRocketPowered implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm rocket powered");
    }
}
