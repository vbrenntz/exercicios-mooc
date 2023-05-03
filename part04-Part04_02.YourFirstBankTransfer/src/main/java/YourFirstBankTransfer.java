
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account acc1 = new Account("Matthews account", 1000.0);
        Account acc2 = new Account("My account", 0);
        acc1.withdrawal(100.0);
        acc2.deposit(100.0);
        System.out.println(acc1.toString() + acc2.toString());
    }
}
