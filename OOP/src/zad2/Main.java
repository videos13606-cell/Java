package zad2;

public class Main {
    public static void main(String[] args) {
        PaymentMethod[] payments = new PaymentMethod[6];
        payments[0] = new CashPayment();
        payments[1] = new CashPayment();
        payments[2] = new CardPayment();
        payments[3] = new CardPayment();
        payments[4] = new BankTransfer();
        payments[5] = new BankTransfer();

        double total = 0;
        for(int i = 0; i < payments.length; i++){
            System.out.println(payments[i].calculateFee(100));
            total += payments[i].calculateFee(100);

        }
        System.out.println("Total: " + total);

    }
}
