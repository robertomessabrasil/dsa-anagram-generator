package io.github.robertomessabrasil.dsa.anagram;

import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void WhenNull_ThrowsException() {

        String str = null;
        Exception exception = assertThrows(RuntimeException.class, () -> {
            AnagramGenerator.permutation(str);
        });

        String expected = "Input cannot be null";
        String actual = exception.getMessage();

        assertTrue(actual.contains(expected));

    }

    @Test
    public void WhenEmpty_ThrowsException() {

        String str = "";
        Exception exception = assertThrows(RuntimeException.class, () -> {
            AnagramGenerator.permutation(str);
        });

        String expected = "Invalid string";
        String actual = exception.getMessage();

        assertTrue(actual.contains(expected));

    }

    @Test
    public void WhenString_Anagram() {

        String str = "abc";

        List<String> list = AnagramGenerator.permutation(str);

        int expected = 6;

        assertEquals(expected, list.size());

    }

}
