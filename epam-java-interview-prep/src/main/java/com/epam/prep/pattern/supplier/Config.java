package com.epam.prep.pattern.supplier;

public class Config {
    private String dbURL;

    public Config(String dbURL) {
        this.dbURL = dbURL;
    }

    public String getDbURL() {
        return dbURL;
    }

    public void setDbURL(String dbURL) {
        this.dbURL = dbURL;
    }

    @Override
    public String toString() {
        return "Config{" + "dbURL='" + dbURL + '\'' + '}';
    }
}
