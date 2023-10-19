package org.example;

import java.util.List;

public class AverageValue {
    public static Integer getAverageValueFromList(List<Integer> firstList) {
        if (firstList == null) {
            throw new IllegalArgumentException("firstList is null");
        }
        int averageValue = 0;
        for (int num : firstList) {
            averageValue += num;
        }
        averageValue /= firstList.size();

        return averageValue;
    }

    public static Boolean getAverageValueFromTwoLists(Integer averageValueFirst, Integer averageValueSecond) {
        if (averageValueFirst == null || averageValueSecond == null) {
            throw new IllegalArgumentException("firstList or secondList is null");
        }

        if (averageValueFirst > averageValueSecond) {
            System.out.println("Первый список имеет большее среднее значение");
        } else if (averageValueFirst < averageValueSecond) {
            System.out.println("Второй список имеет большее среднее значение");
        } else {
            System.out.println("Средние значения равны");
        }

        return true;
    }


}
