package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListNumbers ln = new ListNumbers(List.of(1, 2, 3, 4, 5, 6));
        ListNumbers lns = new ListNumbers(List.of(1, 2, 3, 4, 5, 6));
        ListNumbers lnGt = new ListNumbers(List.of(4, 7, 8, 9, 5, 6));
        int averageOne = AverageValue.getAverageValueFromList(ln.getNumbers());
        int averageTwo = AverageValue.getAverageValueFromList(lns.getNumbers());
        int averageThree = AverageValue.getAverageValueFromList(lnGt.getNumbers());
        AverageValue.getAverageValueFromTwoLists(averageOne,averageTwo); // равны
        AverageValue.getAverageValueFromTwoLists(averageOne,averageThree); // Второй имеет большее значение
        AverageValue.getAverageValueFromTwoLists(averageThree,averageTwo); //Первый имеет большее значение
    }
}