import animals.Animal;
import animals.Lion;
import animals.Wolf;
import cage.LionCage;
import cage.WolfCage;
import factory.LionsFactory;
import factory.WolfFactory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        LionCage cage = L2();
        ArrayList<Lion> lions = cage.getLions();
        cage.sortLionsMane();
         */
        ArrayList<Wolf> wolves = WolfFactory.createWolves(10);
        WolfCage cage = new WolfCage();
        cage.setWolves(wolves);
        cage.setGarbageWeight(120);
        cage.setFoodWeight(1200);
//        System.out.println(cage.getWolves().toString());
        System.out.println("-------------");
        cage.wolfHwSort();
        System.out.println(cage.getWolves().toString());



    }

    public static LionCage L2() {
        ArrayList<Lion> lionsCollection = LionsFactory.createLions(25);
        for (Lion lion : lionsCollection) {
            System.out.println(lion.toString());
        }
        LionCage cage = new LionCage();
        cage.setLions(lionsCollection);
        cage.giveFood(1200);
        cage.setGarbageWeight(150);
        System.out.println(cage);
        System.out.println(cage.getLions().size());

        cage.cleanCage(50);
        for (Lion lion : lionsCollection) {
            System.out.println(lion.toString());
        }
        cage.takeOffAnimal();
        System.out.println(cage);
        System.out.println(cage.getLions().size());
        return cage;
        /*
        Создать package – cage. Работу продолжаем в нем
        Создать интерфейс AnimalCage, который содержит абстрактные методы для:
        добавления в клетку животного
        передачи корма в клетку
        очистку клетки
        Создать для сущности Lion отдельный LionCage, реализующий интерфейс AnimalCage. В клетке должна хранится
        информация о находящихся в ней львах и объем загрязнения клетки.
        Создать package – factory. Работу продолжаем в нем
        Создать класс LionsFactory
        Реализовать в нем статический метод для создания коллекции львов с определенным кол-вом в ней:
        ArrayList<Lion> createLions (int lionCount)
        В методе main создать коллекцию львов и положить её содержимое в клетку. Посмотрите состояние львов,
        покормите львов в клетке, проверьте изменился ли у них вес.
         */
        /* HW3
        Создать класс WolfComparator, реализующий сравнение волков по их весу и возрасту.
        В классе WolfCage добавить метод сортировки волков, используя созданный WolfComparator
        Имплементировать в классе WolfCage интерфейс Iterable<Wolf> и реализовать логику итерации по волкам в
        клетке с помощью класса WolfIterator
         */
    }


}
