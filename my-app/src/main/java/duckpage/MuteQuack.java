package duckpage;

public class MuteQuack implements QuackBehavior{
    //do nothing, can't quack!
    public void quack() {
        System.out.println(">>>> Silence <<<<");
    }
}
