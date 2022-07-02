package Homework4;

public class Plant implements Bloom{
    String namePlant;

    public Plant(String nameTree) {
        this.namePlant = nameTree;
    }

    public String getName() {
        return namePlant;
    }

    public void setNamePlant(String nameTree) {
        this.namePlant = nameTree;
    }

    public String doBloom(){
        String s = "умеет цвести";
        return s;
    }
}
