package DuckTestMain;

import Duck.*;
import FlyBehavior.*;
import QuackBehavior.*;

public class StrategyDuckTest {

	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.setFlyBehavior(new FlyWithWings());
		mallardDuck.setQuackBehavior(new Quack());
		
		mallardDuck.display();
		mallardDuck.swim();
		mallardDuck.fly();
		mallardDuck.quack();
		System.out.println();
		
		RedheadDuck redheadDuck = new RedheadDuck();
		redheadDuck.setFlyBehavior(new FlyWithWings());
		redheadDuck.setQuackBehavior(new Quack());
		
		redheadDuck.display();
		redheadDuck.swim();
		redheadDuck.fly();
		redheadDuck.quack();
		System.out.println();
		
		RubberDuck rubberDuck = new RubberDuck();
		rubberDuck.setFlyBehavior(new NoFly());
		rubberDuck.setQuackBehavior(new Squack());
		
		rubberDuck.display();
		rubberDuck.swim();
		rubberDuck.fly();
		rubberDuck.quack();
		System.out.println();
		
		DecoyDuck decoyDuck = new DecoyDuck();
		decoyDuck.setFlyBehavior(new NoFly());
		decoyDuck.setQuackBehavior(new NoSoundQuack());
		
		decoyDuck.display();
		decoyDuck.swim();
		decoyDuck.fly();
		decoyDuck.quack();
	}
}
