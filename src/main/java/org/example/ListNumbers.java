package org.example;

import java.util.List;

public class ListNumbers {

    private final List<Integer> numbers;

    public ListNumbers(List<Integer> numbers) {
        this.numbers =  numbers;
    }

    public List<Integer> getNumbers() {
        if (numbers == null) {
            throw new IllegalArgumentException("numbers must not be null");
        }
        return numbers;
    }
}
