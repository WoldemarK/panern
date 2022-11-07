package Strategiya;

import Strategiya.fly.FlyNoWay;
import Strategiya.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I’m a real Mallard duck");
    }
}
