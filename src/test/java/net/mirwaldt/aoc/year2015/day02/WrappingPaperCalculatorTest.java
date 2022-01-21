package net.mirwaldt.aoc.year2015.day02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WrappingPaperCalculatorTest {
    private final static WrappingPaperCalculator wrappingPaperCalculator = new DefaultWrappingPaperCalculator();

    private static Stream<Arguments> wrappingPaperCalculator() {
        return Stream.of(Arguments.of(wrappingPaperCalculator));
    }

    @ParameterizedTest
    @MethodSource("wrappingPaperCalculator")
    void test(WrappingPaperCalculator wrappingPaperCalculator) {
        assertEquals(0, wrappingPaperCalculator.calculateWrappingPaper(0,0,0));
        assertEquals(2 * (1 * 1 + 1 * 1 + 1 * 1) + 1 * 1, wrappingPaperCalculator.calculateWrappingPaper(1,1,1));
        assertEquals(2 * (2 * 1 + 2 * 1 + 1 * 1) + 1 * 1, wrappingPaperCalculator.calculateWrappingPaper(2,1,1));
        assertEquals(2 * (1 * 2 + 1 * 1 + 2 * 1) + 1 * 1, wrappingPaperCalculator.calculateWrappingPaper(1,2,1));
        assertEquals(2 * (1 * 1 + 1 * 2 + 1 * 2) + 1 * 1, wrappingPaperCalculator.calculateWrappingPaper(1,1,2));
        assertEquals(2 * (1 * 2 + 1 * 2 + 2 * 2) + 1 * 2, wrappingPaperCalculator.calculateWrappingPaper(1,2,2));
        assertEquals(2 * (2 * 2 + 2 * 2 + 2 * 2) + 2 * 2, wrappingPaperCalculator.calculateWrappingPaper(2,2,2));
        assertEquals(2 * (1 * 2 + 1 * 3 + 2 * 3) + 1 * 2, wrappingPaperCalculator.calculateWrappingPaper(1,2,3));
    }
}
