package duckpage;

class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
        //MallarDuck duck1 = new MallarDuck();
        //duck1.display();
    }
    public void display(){

        System.out.println("I'm just a rubber duck");
    }
    
    
}
