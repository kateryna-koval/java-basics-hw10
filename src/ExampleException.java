public class ExampleException {
    public static int rectangleArea(int a, int b) {
        int area;
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Input value is below zero.");
        } else
            area = a * b;
        return area;
    }
}


