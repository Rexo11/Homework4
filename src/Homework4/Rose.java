package Homework4;

public class Rose extends Plant implements Smell {
    public Rose(String nameTree) {
        super(nameTree);
    }

    public String doSmell(){
        String s = "умеет пахнуть";
        return s;
    }
}
