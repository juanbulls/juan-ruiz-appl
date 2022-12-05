package com.ecore.juanruizappl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HolaControllerTests {
    @Test
    void testHola() {
        HolaController controller = new HolaController();
        String response = controller.hola();
        assertEquals("hola lolas", response);
    }
}
