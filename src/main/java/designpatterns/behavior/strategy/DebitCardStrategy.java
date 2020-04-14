package designpatterns.behavior.strategy;

public class DebitCardStrategy implements PayStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid using debit card : "+ amount);

    }
}
