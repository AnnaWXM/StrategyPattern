package duckpage;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
        //MallarDuck duck1 = new MallarDuck();
        //duck1.display();
    }

    public void display(){
        System.out.println("I'm a real Mallard duck");
    }
    
}
