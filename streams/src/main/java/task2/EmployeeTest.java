package task2;

import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        //Print all emails
        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        //Print all phone numbers => one emp subj's list of phone number at a time
        System.out.println("Print phone no with MAP");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .forEach(System.out::println);

        System.out.println("================FLATMAP=== => all phone numbers in a list==========");

        //Print number seperately -1
        System.out.println("Print phone no with FLAMAP-1");
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);

        ////Print number seperately -2
        System.out.println("Print phone no with FLAMAP-2");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)//list -> list.stream
                .forEach(System.out::println);

        System.out.println("Print phone no with FLAMAP THEN FILTER");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)//list -> list.stream
                .filter(p -> p.startsWith("202"))
                .forEach(System.out::println);


    }
}
