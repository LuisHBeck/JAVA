package listas.Employees.application;

import listas.Employees.entities.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Input the number of employees>> ");
        int num = tec.nextInt();
        tec.nextLine();

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i<num; i++){
            System.out.println();
            System.out.printf("Employee #%d\n",i+1);
            System.out.print("ID>>  ");
            int id = tec.nextInt();
            tec.nextLine();
            System.out.print("Name>> ");
            String name = tec.nextLine();
            System.out.print("Salary>> $");
            double salary = tec.nextDouble();
            tec.nextLine();
            Employee emp = new Employee(id, name, salary);
            list.add(emp);
        }

        System.out.println();
        System.out.print("Input the ID to salary increase>> ");
        int idIncrease = tec.nextInt();
        Integer pos = position(list, idIncrease);
        if (pos == null){
            System.out.println("Invalid ID. No increase salary today");
        }else {
            System.out.print("Input the percentage>> ");
            double percentage = tec.nextDouble();
            list.get(pos).increaseSalary(idIncrease, percentage);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee emp : list){
            System.out.println(emp);
        }

    }
    public static Integer position(List<Employee> list, int id){
        for (int i = 0; i<list.size(); i++){
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}
