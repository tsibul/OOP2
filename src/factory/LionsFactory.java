package factory;

import animals.Lion;

import java.util.ArrayList;

public class LionsFactory {

    public static ArrayList<Lion> createLions (int lionCount){
        ArrayList<Lion> lionsList = new ArrayList<>();
        for(int i = 0; i < lionCount; i++){
            Lion lion = new Lion("l" + i, 20 ,20 , 20, 20);
            lionsList.add(lion);
        }
        return lionsList;
    }
}
