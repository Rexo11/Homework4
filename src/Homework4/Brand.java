package Homework4;

public class Brand {
    String name;
    Magazin[] magazin;

    public Brand(String name, Magazin[] magazin) {
        this.name = name;
        this.magazin = magazin;
    }

    public Magazin[] getMagazin() {
        return magazin;
    }

    public void setMagazin(Magazin[] magazin) {
        this.magazin = magazin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
