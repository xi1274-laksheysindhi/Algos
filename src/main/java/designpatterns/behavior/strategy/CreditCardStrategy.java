package designpatterns.behavior.strategy;

public class CreditCardStrategy implements PayStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid using credit card : "+ amount);
    }
}
