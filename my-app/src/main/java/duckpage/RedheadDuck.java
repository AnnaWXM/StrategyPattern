package duckpage;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
        //MallarDuck duck1 = new MallarDuck();
        //duck1.display();
    }
    public void display(){
        System.out.println("I'm a real Redhead duck");
    }
    
}

