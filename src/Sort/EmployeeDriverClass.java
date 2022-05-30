package Sort;

import java.util.Arrays;

public class EmployeeDriverClass {

    public static  void main(String args[]){
        Employee [] employees = {new Employee(1, "Afolabi", "Taiwo","Marketing",
                "10.12.2022","Male", 10000),
                new Employee(10, "James", "Robbin","Finance",
                        "10.12.2022","Male", 7000),
                new Employee(3, "Helen", "Paul","Quality Control",
                        "10.12.2022","Female", 8000),
                new Employee(9, "Bradley", "John","Publicity",
                        "10.12.2022","Male", 6500),
                new Employee(2, "Goodness", "Faith","IT",
                        "10.12.2022","Female", 1500)
        };

        System.out.println("Before Sorting:" +"" + Arrays.toString(employees));
        Arrays.sort(employees);
        System.out.println("After Sorting:" +"" + Arrays.toString(employees));






    }
}
