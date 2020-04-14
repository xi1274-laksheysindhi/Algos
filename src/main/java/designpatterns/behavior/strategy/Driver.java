package designpatterns.behavior.strategy;

// Strategy design pattern basically eliminates if else from your code basically your driver class must know of
// your strategies like in this we have on main interface PayStrategy and different payment methods implement their
// own implementations of same
// if we donot apply design pattern we need to explicitly handle by if else
// here just driver class need to know about your strategies.

// Strategy design pattern is extendable like if some more payment methods just we need to implements another one
public class Driver {

    public static void main(String[] args) {
        PayStrategy payStrategy = new DebitCardStrategy();
        payStrategy.pay(100);
    }
}
