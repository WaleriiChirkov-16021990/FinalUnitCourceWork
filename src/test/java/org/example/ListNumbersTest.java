package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListNumbersTest {
    private ListNumbers test;

    @BeforeEach
    void setUp() {
        test = new ListNumbers(List.of(1, 2, 3));
        assertEquals(3, test.getNumbers().size());
        assertInstanceOf(ListNumbers.class, test);
    }

    @Test
    void getNumbers() {
        assertEquals(List.of(1, 2, 3), test.getNumbers());
        assertEquals(1, test.getNumbers().get(0));
        assertEquals(3, test.getNumbers().get(2));
        test = new ListNumbers(null);
        assertThrows(IllegalArgumentException.class,() -> test.getNumbers()); //

    }
}