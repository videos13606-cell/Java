package zad2;

public class CardPayment implements PaymentMethod {
    public double calculateFee(double amount)
    {
        return amount*0.02;
    }
}
