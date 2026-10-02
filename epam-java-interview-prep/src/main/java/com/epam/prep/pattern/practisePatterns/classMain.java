package com.epam.prep.pattern.practisePatterns;

public class classMain {
    public static void main(String[] args){
        TaxCalculateService service = new TaxCalculateService();

        System.out.println(service.calculateTax(salType.BUSINESS, 1500000));
        System.out.println(service.calculateTax(salType.COPERATE, 1500000));
        System.out.println(service.calculateTax(salType.INDIVIDUAL, 1500000));
    }
}
