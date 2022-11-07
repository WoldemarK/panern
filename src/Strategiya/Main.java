package Strategiya;

import Strategiya.fly.FlyWithWings;
import Strategiya.quack.MuteQuack;

public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        duck.performQuack();
        duck.performFly();

        duck.setFlyBehavior(new FlyWithWings());
        duck.setQuackBehavior(new MuteQuack());

        duck.performQuack();
        duck.performFly();
    }
}
