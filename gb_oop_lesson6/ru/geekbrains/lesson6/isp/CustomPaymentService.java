package ru.geekbrains.lesson6.isp;

public class CustomPaymentService extends PaymentService implements CreditCardPayable, PhonePayable {

    @Override
    public void payCreditCard(int amount) {
        System.out.println("ru.geekbrains.lesson6.isp.CustomPaymentService оплата через CreditCard");
    }

    @Override
    public void payPhoneNumber(int amount) {
        System.out.println("ru.geekbrains.lesson6.isp.CustomPaymentService оплата через PhoneNumber");
    }
}
