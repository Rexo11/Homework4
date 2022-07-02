package Homework4;

public class Employee {
    Watch watch;
    String name;

    public Employee(Watch watch, String name) {
        this.watch = watch;
        this.name = name;
    }

    public Watch getWatch() {
        return watch;
    }

    public void setWatch(Watch watch) {
        this.watch = watch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
