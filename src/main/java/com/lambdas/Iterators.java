package com.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Iterators {

    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Employee> employees= List.of(new Employee(1,"hash", 200001,32),
                                          new Employee( 2,"test", 100000,31));

        System.out.println("\n Using basic for each loop");
        employees.forEach(employee -> System.out.println(employee));
        System.out.println("\n Using Method Reference");
        employees.forEach(System.out::println);
        List<Employee> filteredEmployees=
        employees.stream().filter(emp -> emp.getSalary()%2==0).toList();
        System.out.println("\n Filtered employees whose salary is divided by 2");
        filteredEmployees.forEach(System.out::println);

        employees.forEach(System.out::println);
        List<Employee> filteredEmployees1= employees.stream().filter(emp -> emp.getSalary()%2==0).collect(Collectors.toList());
        List<Employee> filteredEmployees2=employees.stream().filter(i-> i.getSalary()%5==0).toList();
    }
}

