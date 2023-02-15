package factory;

import animals.Lion;

import java.util.ArrayList;
import java.util.Random;

public class LionsFactory {

    public static ArrayList<Lion> createLions (int lionCount){
        ArrayList<Lion> lionsList = new ArrayList<>();
        for(int i = 0; i < lionCount; i++){
            Random random = new Random();
            Lion lion = new Lion("l" + i, random.nextInt(2018, 2023) , random.nextInt(20, 120), 4, random.nextInt(0, 20));
            lionsList.add(lion);
        }
        return lionsList;
    }
}
