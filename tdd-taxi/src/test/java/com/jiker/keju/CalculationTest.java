package com.jiker.keju;


import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CalculationTest {
    @Test
    public void test() {
        Calculation calculation = new Calculation();
        FileUtile fileUtile = new FileUtile();
        List<String> a = new ArrayList<String>();
        try {
            a = fileUtile.readConfig( "testdata.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < a.size(); i++) {
            calculation.getNumbers(a.get(i));
        }

        assertEquals(calculation.firstPart(),6);
        assertEquals(calculation.secondPart(10),4.8);
        assertEquals(calculation.threePart(0),0);
        assertEquals(calculation.minutePart(0),0);
        assertEquals(calculation.valuation(10,0),13);
        assertEquals(calculation.getNumbers(""),null);
    }

}
