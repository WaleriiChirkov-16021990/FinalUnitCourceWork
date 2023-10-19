package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void mainTest() {
        Main.main(new String[0]);
        assertInstanceOf(Main.class, new Main());
    }
}