package com.prosoft;

/**
 * Паттерн Стратегия (Strategy Pattern) - динамическое управление поведением объекта
 * путем изменения алгоритма UserNameAndPasswordAuthentication() / PhoneNumberAuthentication()
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        String authentication = "UserNameAndPassword";

        if (authentication.equals("UserNameAndPassword")) {
            PaymentService service = new PaymentService(new UserNameAndPasswordAuthentication());
            service.pay();
        } else {
            PaymentService service = new PaymentService(new PhoneNumberAuthentication());
            service.pay();
        }


    }
}
