package ru.job4j.Condition;

import org.junit.Assert;
import org.junit.Test;

 public class PointTest {
     @Test
    public void when00to20then2() {
         Point a = new Point(0, 0);
         Point b = new Point(0, 2);
         double out = a.distance(b);
         double expected = 2;
         Assert.assertEquals(expected, out, 0.01);
     }

     @Test
     public void when11to21then1() {
         Point a = new Point(1, 1);
         Point b = new Point(2, 1);
         double out = a.distance(b);
         double expected = 1;
         Assert.assertEquals(expected, out, 0.01);
     }

     @Test
     public void when53to51then2() {
         Point a = new Point(5, 3);
         Point b = new Point(5, 1);
         double out = a.distance(b);
         double expected = 2;
         Assert.assertEquals(expected, out, 0.01);
     }

     @Test
     public void when20to10then1() {
         Point a = new Point(2, 0);
         Point b = new Point(1, 0);
         double out = a.distance(b);
         double expected = 1;
         Assert.assertEquals(expected, out, 0.01);
     }

     @Test
     public void when500to400then1() {
         Point a = new Point(5, 0, 0);
         Point b = new Point(4, 0, 0);
         double out = a.distance(b);
         double expected = 1;
         Assert.assertEquals(expected, out, 0.01);
     }
}
