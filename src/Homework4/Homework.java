package Homework4;

public class Homework {
    public static void main(String[] args){
        //Продвинутый уровень
        //Задача №1
        //1. Создать следующую структуру из классов и интерфейсов:
        // дерево -> ель (имеет шишки, умеет пахнуть)
        // дерево -> сосна (имеет шишки, умеет пахнуть)
        // растение -> роза (умеет цвести, умеет пахнуть)
        // растение -> папоротник (умеет цвести)
        // Создать у каждого класса по объекту, распределить по массивам интерфейсов
        // И у каждого массива вызвать характерный метод
        //Ожидание:
        // сосна : умеет пахнуть
        // ель : умееть пахнуть
        // роза: умееть пахнуть
        // роза: умеет цвести
        // папоротник: умеет цвести
        System.out.println("Задача 1\n");

        Fir fir = new Fir("Ель");
        Pine pine = new Pine("Сосна");
        Rose rose = new Rose("Роза");
        Fern fern = new Fern("Папоротник");

        Smell[] smells = {fir, pine, rose};
        Bloom[] blooms = {rose, fern};

        for (Smell smell: smells){
            System.out.println(smell.getName() + ": " + smell.doSmell());
        }

        for (Bloom bloom: blooms) {
            System.out.println(bloom.getName() + ": " + bloom.doBloom());
        }

        //Задача №2
        //2. Создать следующую структуру из классов и интерфейсов
        // магазин (обладает работниками)
        // работник (обладает часами)
        // часы (умеют тикать, если сломаны выкидывают ошибку WatchBrokenError)
        // Бренд (обладает массивом магазинов)
        // Создать бренд, положить в него два магазина, в каждом магазине будет по работнику,
        // у каждого работника по часам. У одного работника часы сломаны, у второго нет.
        // После создания бренда, вытащить из него все часы и вызвать у всех часов метод тикать,
        // обработать ошибку сломанных часов.
        // Ожидание вывода на экран:
        // Часы тикают
        // Ошибка: Часы сломались.
        System.out.println("\nЗадача 2\n");

        Watch watch1 = new Watch("Citizen", true);
        Watch watch2 = new Watch("Zenit", false);

        Employee emp1 = new Employee(watch1, "Вася");
        Employee emp2 = new Employee(watch2, "Маня");

        Magazin mag1 = new Magazin("Магазин1", emp1);
        Magazin mag2 = new Magazin("Магазин2", emp2);

        Magazin[] mags = {mag1, mag2};

        Brand kia = new Brand("Киа", mags);

        for (Magazin mag: kia.magazin) {
            System.out.println(mag.employee.getName());
            mag.employee.watch.ticking();
        }
    }
}
