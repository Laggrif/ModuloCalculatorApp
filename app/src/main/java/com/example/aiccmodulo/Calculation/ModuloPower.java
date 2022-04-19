package com.example.aiccmodulo.Calculation;

public class ModuloPower {
    private ModuloPower(){}

    /**
     * return (a power b) mod m
     * @param a number
     * @param b power
     * @param m modulo
     * @return (a power b) mod m
     */
    public static long moduloPower(long a, long b, long m){
        long r = 1;
        for (int i = 0; i < b; i++) {
            r = (r * a) % m;
        }
        return r;
    }
}
