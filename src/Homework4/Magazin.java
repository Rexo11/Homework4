package Homework4;

public class Magazin {
    String name;
    Employee employee;

    public Magazin(String name, Employee employee) {
        this.name = name;
        this.employee = employee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
