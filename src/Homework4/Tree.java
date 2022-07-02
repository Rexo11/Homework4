package Homework4;

public class Tree implements Smell{
    String nameTree;

    public Tree(String nameTree) {
        this.nameTree = nameTree;
    }

    public String getName() {
        return nameTree;
    }

    public void setNameTree(String nameTree) {
        this.nameTree = nameTree;
    }

    public String doSmell(){
        String s = "умеет пахнуть";
        return s;
    }

    public void haveCone(){
        System.out.println("имеет шишки");
    }
}
