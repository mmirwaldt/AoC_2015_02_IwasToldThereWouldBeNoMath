package net.mirwaldt.day2;

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
        assertEquals(7, wrappingPaperCalculator.calculateWrappingPaper(1,1,1));
        assertEquals(11, wrappingPaperCalculator.calculateWrappingPaper(2,1,1));
        assertEquals(11, wrappingPaperCalculator.calculateWrappingPaper(1,2,1));
        assertEquals(11, wrappingPaperCalculator.calculateWrappingPaper(1,1,2));
        assertEquals(18, wrappingPaperCalculator.calculateWrappingPaper(1,2,2));
        assertEquals(28, wrappingPaperCalculator.calculateWrappingPaper(2,2,2));
        assertEquals(24, wrappingPaperCalculator.calculateWrappingPaper(1,2,3));
    }
}
