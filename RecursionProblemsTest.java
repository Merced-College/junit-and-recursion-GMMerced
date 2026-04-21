import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RecursionProblemsTest {

    @Test
    void testCount8() {
        assertEquals(1, RecursionProblems.count8(8));
        assertEquals(2, RecursionProblems.count8(818));
        assertEquals(4, RecursionProblems.count8(8818));
        assertEquals(0, RecursionProblems.count8(123));
        assertEquals(2, RecursionProblems.count8(88));
    }

    @Test
    void testCountHi() {
        assertEquals(1, RecursionProblems.countHi("xxhixx"));
        assertEquals(2, RecursionProblems.countHi("xhixhix"));
        assertEquals(1, RecursionProblems.countHi("hi"));
        assertEquals(0, RecursionProblems.countHi("abc"));
        assertEquals(3, RecursionProblems.countHi("hihihi"));
    }

    @Test
    void testCountHi2() {
        assertEquals(1, RecursionProblems.countHi2("ahixhi"));
        assertEquals(2, RecursionProblems.countHi2("ahibhi"));
        assertEquals(0, RecursionProblems.countHi2("xhixhi"));
        assertEquals(1, RecursionProblems.countHi2("hixhi"));
        assertEquals(0, RecursionProblems.countHi2("xhixhix"));
    }

    @Test
    void testStrCount() {
        assertEquals(2, RecursionProblems.strCount("catcowcat", "cat"));
        assertEquals(1, RecursionProblems.strCount("catcowcat", "cow"));
        assertEquals(0, RecursionProblems.strCount("catcowcat", "dog"));
        assertEquals(3, RecursionProblems.strCount("aaa", "a"));
        assertEquals(1, RecursionProblems.strCount("aaaa", "aa"));
    }

    @Test
    void testStringClean() {
        assertEquals("yza", RecursionProblems.stringClean("yyzzza"));
        assertEquals("abcd", RecursionProblems.stringClean("abbbcdd"));
        assertEquals("Helo", RecursionProblems.stringClean("Hello"));
        assertEquals("a", RecursionProblems.stringClean("aaaa"));
        assertEquals("abc", RecursionProblems.stringClean("abc"));
    }
}