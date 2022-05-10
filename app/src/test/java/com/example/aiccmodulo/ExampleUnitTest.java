package com.example.aiccmodulo;

import org.junit.Test;

import static com.example.aiccmodulo.Calculation.Euclid.gcd;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void Main(){
        int c = 0;
        for (int i = 1; i<437; i++){
            if (gcd(i, 437) == 1){
                c ++;
            }
        }
        System.out.println(c);
    }
}