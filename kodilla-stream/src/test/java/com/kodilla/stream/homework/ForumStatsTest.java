package com.kodilla.stream.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ForumStatsTest {
    @Test
    public void testAvgOlderThen40Expected() {
        double expectedAverage = 50.0;
        double actualAverage = ForumStats.avgOlderThen40();
        Assertions.assertEquals(expectedAverage, actualAverage, 0.01);
    }
    @Test
    public void testAvgYoungerThen40Expected() {
        double expectedAverage = 29.5;
        double actualAverage = ForumStats.avgYoungerThen40();
        Assertions.assertEquals(expectedAverage, actualAverage, 0.01);
    }
    @Test
    public void testAvgOlderThen40InputBoundaries() {
        double expectedAverage = 51.0;
        double actualAverage = ForumStats.avgOlderThen40();
        Assertions.assertEquals(expectedAverage, actualAverage, 0.01);
    }
    @Test
    public void testAvgYoungerThen40InputBoundaries() {
        double expectedAverage = 29.3;
        double actualAverage = ForumStats.avgYoungerThen40();
        Assertions.assertEquals(expectedAverage, actualAverage, 0.01);
    }
}