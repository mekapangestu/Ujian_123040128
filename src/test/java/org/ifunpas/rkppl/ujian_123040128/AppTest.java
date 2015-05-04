package org.ifunpas.rkppl.ujian_123040128;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNull;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

/**
 * Unit test for simple App.
 */
public class AppTest{

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    private static Soal s;

    @Before
    public void awaltest() {
        s = new Soal();
        System.out.println("Mengawali Test");
    }

    @Test
    public void testPerkalian() {
        assertNotNull("Perkalian 5 dengan 5 adalah 25", s.perkalian(5, 5));
        System.out.println(s.perkalian(5, 5));
    }

    @After
    public void akhirTest() {
        System.out.println("Mengakhiri Test");
    }
}
