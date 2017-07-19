package simuDuck;

import simuDuck.ducks.Duck;
import simuDuck.ducks.MallardDuck;
import simuDuck.flyBehavior.FlyWithWings;
import simuDuck.quackBehavior.Squeak;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.setFlyBehavior(new FlyWithWings());
		mallard.setQuackBehavior(new Squeak());
		mallard.performFly();
		mallard.performQuack();
		
	}

}
