package designpatterns.behavior.strategy;

public class NetBankingStrategy implements PayStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid using net banking : "+ amount);

    }
}
