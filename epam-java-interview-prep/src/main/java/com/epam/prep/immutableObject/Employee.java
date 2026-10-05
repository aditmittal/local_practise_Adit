package com.epam.prep.immutableObject;

import java.util.List;
import java.util.Objects;

public final class Employee {
    private final String name;
    private final int Id;
    private final List<String> roles;

    public Employee(String name, int id, List<String> roles) {
        this.name = name;
        Id = id;
        this.roles = List.copyOf(roles);
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return Id;
    }
    public List<String> getRoles() {
        return roles;
    }
    @Override
    public boolean equals(Object o){
        if(this == o)return true;
        if(!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        return Id == employee.Id && name.equals(employee.name) && roles.equals(employee.roles);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, Id, roles);
    }
}
