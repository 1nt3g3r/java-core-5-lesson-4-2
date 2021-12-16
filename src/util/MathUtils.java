package util;

public final class MathUtils {
    public static final float PI = 3.14f;

    public static int calcQuadArea(int side) {
        return side * side;
    }

    public static float calcCircleArea(float r) {
        return PI * r * r;
    }

    public static float max(float a, float b) {
        return a > b ? a : b;
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    public static void main(String[] args) {
        System.out.println("max(1f, 2f) = " + max(1f, 2));
        System.out.println("max(10, 20) = " + max(10, 20));
        System.out.println("max(3, 1, 5) = " + max(3, 1, 5));
    }

}
