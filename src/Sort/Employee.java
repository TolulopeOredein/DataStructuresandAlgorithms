package Sort;

import java.util.Date;

public class Employee implements Comparable<Employee>{
    private Integer id;
    private String firstName;
    private String lastName;
    private String department;
    private String employmentDate;
    private String gender;
    private int salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", employmentDate='" + employmentDate + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }



    public Employee(Integer id, String firstName, String lastName, String department,
                    String employmentDate, String gender, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.employmentDate = employmentDate;
        this.gender = gender;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmploymentDate() {
        return employmentDate;
    }

    public String getGender() {
        return gender;
    }

    public int getSalary() {
        return salary;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmploymentDate(String employmentDate) {
        this.employmentDate = employmentDate;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }



    @Override
    public int compareTo(Employee employee) {

        return this.id- employee.id;  //sorts in ascending order

        //return employee.id - this.id;  //sorts in descending order

        //return this.salary- employee.salary;  // sorts by Salary
    }
}
