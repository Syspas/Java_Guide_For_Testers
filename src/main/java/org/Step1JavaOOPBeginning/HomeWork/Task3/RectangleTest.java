package org.Step1JavaOOPBeginning.HomeWork.Task3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void testCalculateArea() {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        double expectedArea = 15.0;
        double actualArea = rectangle.calculateArea();
        assertEquals(expectedArea, actualArea, "Площадь рассчитана неверно");
    }

    @Test
    public void testCalculatePerimeter() {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        double expectedPerimeter = 16.0;
        double actualPerimeter = rectangle.calculatePerimeter();
        assertEquals(expectedPerimeter, actualPerimeter, "Периметр рассчитан неверно");
    }
}