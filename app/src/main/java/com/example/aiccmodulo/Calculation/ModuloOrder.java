package com.example.aiccmodulo.Calculation;


import java.util.TreeMap;

public class ModuloOrder {

    public static TreeMap<Integer, Integer> orderMultiplication(int universe, int[] values){
        TreeMap<Integer, Integer> result = new TreeMap<>();
        for (int n : values){
            int order = 1;
            int temp = n;
            while (! (temp == 1)){
                temp = (n * temp) % universe;
                order += 1;
            }
            result.put(n, order);
        }
        return result;
    }

    public static TreeMap<Integer, Integer> orderAddition(int universe, int[] values){
        TreeMap<Integer, Integer> result = new TreeMap<>();
        for (int n : values){
            int order = 1;
            int temp = n;
            while (! (temp == 1)){
                temp = (n + temp) % universe;
                order += 1;
            }
            result.put(n, order);
        }
        return result;
    }
}
