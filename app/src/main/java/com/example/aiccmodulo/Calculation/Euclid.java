package com.example.aiccmodulo.Calculation;

public class Euclid {
    private final long[] uvd;

    public Euclid(long a, long b) {
        this.uvd = ExtendedEuclid(a, b);
    }

    private long[] ExtendedEuclid(long a, long b) {
        long[] UVD;
        if (a < b) {
            UVD = ExtendedEuclid(b, a);
            return new long[]{UVD[1], UVD[0], UVD[2]};
        } else if (b == 0) {
            return new long[]{1, 0, a};
        } else {
            long q = a / b;
            long r = a % b;
            UVD = ExtendedEuclid(b, r);
            return new long[]{UVD[1], UVD[0] - UVD[1] * q, UVD[2]};
        }
    }

    @Override
    public String toString(){
        StringBuilder string = new StringBuilder();
        string.append("u = ").append(uvd[0]).append("   ||   v = ").append(uvd[1]).append("   ||   d = ").append(uvd[2]);
        return string.toString();
    }

    public static long gcd(long a, long b){
        if (a < b) {
            return gcd(b, a);
        } else if (b == 0){
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
