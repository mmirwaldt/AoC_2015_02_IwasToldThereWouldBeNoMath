package net.mirwaldt.day2;

public class DefaultWrappingPaperCalculator implements WrappingPaperCalculator {
    @Override
    public int calculateWrappingPaper(int length, int width, int height) {
        final int frontArea = length * width;
        final int leftArea = width * height;
        final int topArea = length * height;
        return 2 * (frontArea + leftArea + topArea) + Math.min(frontArea, Math.min(leftArea, topArea));
    }
}
