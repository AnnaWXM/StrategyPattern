package duckpage;

public class FlyNoWay implements FlyBehavior {
    //do nothing, can't fly!
    public void fly() {
        System.out.println("I can't fly..");
    }
}
