package ru.geekbrains.lesson6.isp;

public class InternetPaymentService extends PaymentService implements CreditCardPayable, PhonePayable, WebMoneyPayable {
    @Override
    public void payWebMoney(int amount) {
        System.out.println("ru.geekbrains.lesson6.isp.InternetPaymentService оплата через WebMoney");
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.println("ru.geekbrains.lesson6.isp.InternetPaymentService оплата через CreditCard");
    }

    @Override
    public void payPhoneNumber(int amount) {
        System.out.println("ru.geekbrains.lesson6.isp.InternetPaymentService оплата через PhoneNumber");
    }
}
