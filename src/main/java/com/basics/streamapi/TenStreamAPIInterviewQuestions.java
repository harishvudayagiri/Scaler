package com.basics.streamapi;

import com.lambdas.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TenStreamAPIInterviewQuestions {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1,2,32,4,5);
        int[] arr={1,2,3,4,5,6};
        System.out.println(nums.stream().mapToInt(Integer::intValue).sum());
        //Sum of elements in the array
        nums.stream().mapToInt(Integer::intValue).sum();
        System.out.println("in arrays "+Arrays.stream(arr).sum());
        System.out.println("in arrays,max value "+ Arrays.stream(arr).max().getAsInt());
        System.out.println(nums.stream().mapToInt(Integer::intValue).max().getAsInt());
        int max=nums.stream().max(Comparator.naturalOrder()).get();
        System.out.println("max using comparator "+max);
        List<Employee> emp=Arrays.asList(new Employee(1,"hash",1000000,32),
                                         new Employee(2,"test1",200000,32),
                new Employee(3,"Anu",300025,31),
                new Employee(4,"Nami",100021,31),
                new Employee(5,"hasmi",10021,29));

        //max of elements in the array
        emp.forEach(System.out::println);
        emp.stream().filter(e -> e.getSalary()%2==0).forEach(System.out::println);
        emp.stream().filter(employee -> employee.getSalary()%2==0).forEach(employee -> System.out.println("Salary divisible by 2 "+employee));
        nums.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Max using regular array "+Arrays.stream(arr).max().getAsInt());
        System.out.println("Max using regular array "+ nums.stream().max(Comparator.naturalOrder()).get());
        emp.stream().filter(e -> e.getEmpName().startsWith("h")).forEach(employee -> System.out.println(employee));

        System.out.println("Integer List Sum = "+
        nums.stream().mapToInt(Integer::intValue).sum());
        System.out.println("Integer Array Sum = "+Arrays.stream(arr).sum());
        System.out.println();
        nums.stream().forEach(System.out::println);

        List<Employee> filteredEmpList=emp.stream().filter(employee -> employee.getEmpName().startsWith("h")).toList();
        filteredEmpList.forEach(employee -> System.out.println(employee.getEmpName()+" "+employee.getId()+" "+employee.getSalary()));
        System.out.println("no of employees name starting with h "+emp.stream().filter(employee -> employee.getEmpName().
                startsWith("h")).toList().size());

        System.out.println("max value in the list "+nums.stream().max(Comparator.naturalOrder()).get());
        System.out.println("max value in the "+Arrays.stream(arr).max().getAsInt());

        List<Employee> thirtyPlus=emp.stream().filter(employee -> employee.getAge()>30).toList();
        thirtyPlus.forEach(System.out::println);
        emp.forEach(e -> e.setSalary(e.getSalary()*2));
        emp.forEach(System.out::println);

        List<List<String>> fruits=Arrays.asList(
                Arrays.asList("Apple","Banana","Cheeku"),
                Arrays.asList("Grapes","PineApple","Dates"),
                Arrays.asList ("Peach","Apricot"));

                fruits.stream().flatMap(List::stream).toList().forEach(System.out::println);
                System.out.println("Fruits from flat map");
                fruits.stream().flatMap(List::stream).filter(k-> k.startsWith("A")).toList().
                        forEach(System.out::println);

    }
}
