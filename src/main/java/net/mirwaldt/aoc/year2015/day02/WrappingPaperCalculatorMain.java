package net.mirwaldt.aoc.year2015.day02;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WrappingPaperCalculatorMain {
    public static void main(String[] args) throws IOException {
        final List<String> lines = Files.readAllLines(Path.of("input.txt"), StandardCharsets.US_ASCII);
        final WrappingPaperCalculator wrappingPaperCalculator = new DefaultWrappingPaperCalculator();
        int allWrappingPaper = 0;
        for (String line : lines) {
            final String[] numbers = line.split("x");
            final int length = Integer.parseInt(numbers[0]);
            final int width = Integer.parseInt(numbers[1]);
            final int height = Integer.parseInt(numbers[2]);
            allWrappingPaper += wrappingPaperCalculator.calculateWrappingPaper(length, width, height);
        }
        System.out.println(allWrappingPaper); // result : 1606483
    }
}
