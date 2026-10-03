package com.epam.prep.pattern.supplier;

import java.util.function.Supplier;

public class ConfigService {
    private final Supplier<Config> configSupplier;

    public ConfigService() {
        this.configSupplier = () -> loadConfig();
    }
    private Config loadConfig(){
        System.out.println("LOADING CONFIG");
        return new Config("www.abcd.com");
    }

    public Config getConfigSupplier() {
        return configSupplier.get();
    }
}
