package net.mirwaldt.aoc.year2015.day02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RibbonCalculatorTest {
    private final static RibbonCalculator wrappingPaperCalculator = new DefaultRibbonCalculator();

    private static Stream<Arguments> ribbonCalculator() {
        return Stream.of(Arguments.of(wrappingPaperCalculator));
    }

    @ParameterizedTest
    @MethodSource("ribbonCalculator")
    void test(RibbonCalculator ribbonCalculator) {
        assertEquals(0, ribbonCalculator.calculateRibbon(0,0,0));
        assertEquals(1 + 1 + 1 + 1 + 1 * 1 * 1, ribbonCalculator.calculateRibbon(1,1,1));
        assertEquals(1 + 1 + 1 + 1 + 2 * 1 * 1, ribbonCalculator.calculateRibbon(2,1,1));
        assertEquals(1 + 1 + 1 + 1 + 1 * 2 * 1, ribbonCalculator.calculateRibbon(1,2,1));
        assertEquals(1 + 1 + 1 + 1 + 1 * 1 * 2, ribbonCalculator.calculateRibbon(1,1,2));
        assertEquals(1 + 1 + 2 + 2 + 1 * 2 * 2, ribbonCalculator.calculateRibbon(1,2,2));
        assertEquals(2 + 2 + 2 + 2 + 2 * 2 * 2, ribbonCalculator.calculateRibbon(2,2,2));
        assertEquals(1 + 1 + 2 + 2 + 1 * 2 * 3, ribbonCalculator.calculateRibbon(1,2,3));
    }
}
