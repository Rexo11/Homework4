package Homework4;

import java.io.IOException;

public class Watch {
    String name;
    boolean isWork;

    public Watch(String name, boolean isWork) {
        this.name = name;
        this.isWork = isWork;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWork() {
        return isWork;
    }

    public void setWork(boolean work) {
        isWork = work;
    }

    public void ticking(){
        try {
            if (this.isWork) {
                System.out.println("Часы тикают");
            } else {
                throw new WatchBrokenError("Ошибка: Часы сломались");
            }
        } catch (Exception WatchBrokenError) {
            System.out.println("Ошибка: Часы сломались");
        }

    }
}
