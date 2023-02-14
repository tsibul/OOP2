import animals.Lion;
import cage.AnimalCage;
import cage.LionCage;
import factory.LionsFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Lion> lionsCollection = LionsFactory.createLions(10);
//        LionCage cage = LionCage(lionsCollection );
        }


}
/*
Создать package – cage. Работу продолжаем в нем
Создать интерфейс AnimalCage, который содержит абстрактные методы для:
добавления в клетку животного
передачи корма в клетку
очистку клетки
Создать для сущности Lion отдельный LionCage, реализующий интерфейс AnimalCage. В клетке должна хранится информация о находящихся в ней львах и объем загрязнения клетки.
,
 */


/*
Создать package – factory. Работу продолжаем в нем
Создать класс LionsFactory
Реализовать в нем статический метод для создания коллекции львов с определенным кол-вом в ней:
ArrayList<Lion> createLions (int lionCount)
В методе main создать коллекцию львов и положить её содержимое в клетку. Посмотрите состояние львов, покормите львов в клетке, проверьте изменился ли у них вес.

 */