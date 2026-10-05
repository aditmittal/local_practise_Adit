package com.epam.prep.immutableObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImmutbaleKey {
    public static void main(String[] args){
        Employee e1 = new Employee("adit", 1212, List.of("SSE"));
        Employee e2 = new Employee("adit", 1212, List.of("SSE"));
        Map<Employee, String> map = new HashMap<>();
        map.put(e1, "pune");
        map.put(e2, "delhi");
        System.out.println(map.size());
    }
}
