package net.mirwaldt.day2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class RibbonCalculatorMain {
    public static void main(String[] args) throws IOException {
        final List<String> lines = Files.readAllLines(Path.of("input.txt"), StandardCharsets.US_ASCII);
        final RibbonCalculator ribbonCalculator = new DefaultRibbonCalculator();
        int ribbon = 0;
        for (String line : lines) {
            final String[] numbers = line.split("x");
            final int length = Integer.parseInt(numbers[0]);
            final int width = Integer.parseInt(numbers[1]);
            final int height = Integer.parseInt(numbers[2]);
            ribbon += ribbonCalculator.calculateRibbon(length, width, height);
        }
        System.out.println(ribbon); // result : 3842356
    }
}
