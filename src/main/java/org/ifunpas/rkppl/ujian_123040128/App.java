package org.ifunpas.rkppl.ujian_123040128;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Test Case
 *
 */
public class App {

    private static Soal s;

    public static void main(String[] args) {
        s = new Soal();
        
        System.out.println("Perkalian");
        System.out.println(s.perkalian(5, 5));
        System.out.println("Pangkat");
        System.out.println(s.pangkat(5, 2));
        System.out.println("Faktorial");
        System.out.println(s.faktorial(5));
    }
}
