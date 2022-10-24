package com.cursor;

public class Main {

    public static void main(String[] args) {

        byte a = 10;
        byte b = 9;
        byte c = (byte) (a + b);

        System.out.println(c);

        short d = 20;
        short e = 4;
        int f = d - e;

        System.out.println(f);

        float h = 20;
        float l = 3;
        double k = (double) h / l;

        System.out.println(k);

        int m = 100;
        int n = 200;
        long p = m*n;

        System.out.println(p);

        int r = 15;
        int q = 8;
        int s = r % q;

        System.out.println(s);
    }
}
