package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class AverageValueTest {
    private ListNumbers listNumbers = Mockito.mock(ListNumbers.class);
    private final PrintStream out = System.out;
    private ByteArrayOutputStream byteArrayOutputStream;

    @BeforeEach
    void setUp() {
//        listNumbers = new ListNumbers(List.of(1, 2, 3));
        when(listNumbers.getNumbers()).thenReturn(List.of(1, 2, 3));
        byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));
        assertInstanceOf(AverageValue.class, new AverageValue());
    }

    private String getOutput() {
        return byteArrayOutputStream.toString();
    }

    @Test
    void getAverageValueFromList() {
        assertEquals(2,AverageValue.getAverageValueFromList(listNumbers.getNumbers()));
        assertThrows(IllegalArgumentException.class,() -> AverageValue.getAverageValueFromList(null));
    }

    @Test
    void getAverageValueFromTwoLists() {
        assertThrows(IllegalArgumentException.class,() -> AverageValue.getAverageValueFromTwoLists(null,1));
        assertThrows(IllegalArgumentException.class,() -> AverageValue.getAverageValueFromTwoLists(3,null));

        String outputFirstNumberChampion = "Первый список имеет большее среднее значение\r\n";
        String outputTwoNumberChampion = "Первый список имеет большее среднее значение\r\nВторой список имеет большее среднее значение\r\n";
        String outputEquality = "Первый список имеет большее среднее значение\r\n" +
                "Второй список имеет большее среднее значение\r\nСредние значения равны\r\n";
        AverageValue.getAverageValueFromTwoLists(5,4);
        assertEquals(outputFirstNumberChampion, getOutput());
        AverageValue.getAverageValueFromTwoLists(6,10);
        assertEquals(outputTwoNumberChampion,getOutput());
        AverageValue.getAverageValueFromTwoLists(11,11);
        assertEquals(outputEquality,getOutput() );
        assertTrue(AverageValue.getAverageValueFromTwoLists(56,3));
    }

    @AfterEach
    void tearDown(){
        System.setOut(out);
    }

}