package com.epam.prep.pattern.supplier;

public class MainSupplier {

    public static void main(String[] args){
        ConfigService service = new ConfigService();

        System.out.println("SERICE CREATED");

        Config config = service.getConfigSupplier();
        System.out.println(config);
    }




}
