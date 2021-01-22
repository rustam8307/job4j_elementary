package ru.job4j.Condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMaxFrom2Arg() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMaxFrom3Arg() {
        int result = Max.max(1, 2, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMaxFrom4Arg() {
        int result = Max.max(1, 2, 1, 0);
        assertThat(result, is(2));
    }
}