
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals = 0;
    private int heartyMeals = 0;


    public PaymentTerminal() {
        this.money = 1000.0;
    }

    public double eatAffordably(double payment) {
        
        if (payment >= 2.5) {
            double change = 0;
            change = payment - 2.5;
            this.affordableMeals++;
            this.money += payment - change;
            return change;
            
        } else {
            return payment;
        }
    }

    public double eatHeartily(double payment) {
        if (payment >= 4.3) {
            double change = 0;
            change = payment - 4.3;
            this.heartyMeals++;
            this.money += payment - change;
            return change;
            
        } else {
            return payment;
        }
    }
    
    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= 2.5) {
            card.takeMoney(2.5);
            this.affordableMeals++;
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= 4.3) {
            card.takeMoney(4.3);
            this.heartyMeals++;
            return true;
        }
        return false;
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        } else {
            card.balance();
        }

}


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
