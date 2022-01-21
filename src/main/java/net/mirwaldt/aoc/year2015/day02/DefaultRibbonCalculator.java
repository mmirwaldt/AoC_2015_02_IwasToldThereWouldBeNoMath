package net.mirwaldt.aoc.year2015.day02;

import java.util.ArrayList;
import java.util.Collections;

public class DefaultRibbonCalculator implements RibbonCalculator {
    @Override
    public int calculateRibbon(int length, int width, int height) {
        final ArrayList<Integer> sortedList = new ArrayList<>();
        sortedList.add(length);
        sortedList.add(width);
        sortedList.add(height);
        Collections.sort(sortedList);

        final int firstMin = sortedList.remove(0);
        final int secondMin = sortedList.remove(0);
        return firstMin + firstMin + secondMin + secondMin + length * width * height;
    }
}
