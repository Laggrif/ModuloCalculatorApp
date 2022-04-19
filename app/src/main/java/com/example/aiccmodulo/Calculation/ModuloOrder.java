package com.example.aiccmodulo.Calculation;


import java.util.ArrayList;
import java.util.TreeMap;

import static com.example.aiccmodulo.Calculation.Euclid.gcd;

public class ModuloOrder {

    public static TreeMap<Long, Long> orderMultiplication(long universe){
        TreeMap<Long, Long> result = new TreeMap<>();
        Long[] values = orderValuesComputer(universe, true);
        for (long n : values){
            long order = 1;
            long temp = n;
            while (! (temp == 1)){
                temp = (n * temp) % universe;
                order += 1;
            }
            result.put(n, order);
        }
        return result;
    }

    public static TreeMap<Long, Long> orderAddition(long universe){
        TreeMap<Long, Long> result = new TreeMap<>();
        result.put(0l, 1l);
        Long[] values = orderValuesComputer(universe, false);
        for (long n : values){
            long order = 1;
            long temp = n;
            while (! (temp == 0)){
                temp = (n + temp) % universe;
                order += 1;
            }
            result.put(n, order);
        }
        return result;
    }

    private static Long[] orderValuesComputer(long universe, boolean multiplication){
        ArrayList<Long> values = new ArrayList<>();
        for (long i = 1; i < universe; i ++){
            if (!multiplication) {
                values.add(i);
            }else if (gcd(i, universe) == 1 ) {
                values.add(i);
            }
        }
        return values.toArray(new Long[values.size()]);
    }
}
