/**
 * 
 */
package simuDuck.ducks;

import simuDuck.flyBehavior.FlyBehavior;
import simuDuck.quackBehavior.QuackBehavior;

/**
 * @author hpapudippu
 *
 */
public abstract class Duck {
	public FlyBehavior flyBehavior;
	public QuackBehavior quackBehavior;
	public void swim(){}
	public void display() {}
	public void performQuack() {
		quackBehavior.quack();
	}
	public void performFly() {
		flyBehavior.fly();
	}
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
	
}
