package duckpage;

/**
 * Hello world!
 *
 */

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        //FlyBehavior flyBehavior;
        //QuackBehavior quackBehavior;

    }
}
