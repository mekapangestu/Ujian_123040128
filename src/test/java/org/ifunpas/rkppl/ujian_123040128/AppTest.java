package org.ifunpas.rkppl.ujian_123040128;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertSame;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

/**
 * Unit test for simple App.
 */
public class AppTest {

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

    @Test
    public void testPangkat() {
        assertSame(s.pangkat(5, 2), 25);
        System.out.println(s.pangkat(5, 2));
    }

    @Test
    public void testFaktorial() {
        assertSame(s.faktorial(5), 4);
        System.out.println(s.faktorial(5));
    }

    @Test
    public void testPerkalianSama() {
        assertEquals("Seharusnya sama", s.perkalian(5, 5), 25);
    }

    @After
    public void akhirTest() {
        System.out.println("Mengakhiri Test");
    }
}
