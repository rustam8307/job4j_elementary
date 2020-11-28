package ru.job4j.Condition;

import org.junit.Assert;
import org.junit.Test;

 public class PointTest {
     @Test
    public void when00to20then2() {
         int expected = 2;
         int x1 = 0;
         int y1 = 0;
         int x2 = 2;
         int y2 = 0;
         double out = Point.distance(x1, y1, x2, y2);
         Assert.assertEquals(expected, out, 0.01);
     }

     public void when11to21then1() {
         int expected = 1;
         int x1 = 1;
         int y1 = 1;
         int x2 = 2;
         int y2 = 1;
         double out = Point.distance(x1, y1, x2, y2);
         Assert.assertEquals(expected, out, 0.01);
     }

     public void when53to51then2() {
         int expected = 2;
         int x1 = 5;
         int y1 = 3;
         int x2 = 5;
         int y2 = 1;
         double out = Point.distance(x1, y1, x2, y2);
         Assert.assertEquals(expected, out, 0.01);
     }

     public void when20to10then1() {
         int expected = 1;
         int x1 = 2;
         int y1 = 0;
         int x2 = 1;
         int y2 = 0;
         double out = Point.distance(x1, y1, x2, y2);
         Assert.assertEquals(expected, out, 0.01);
     }
}
