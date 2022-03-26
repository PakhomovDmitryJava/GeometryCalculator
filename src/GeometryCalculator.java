import java.math.*;
import java.math.BigDecimal;


public class GeometryCalculator {
    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius)
    {
       double circleSquare = Math.pow(radius, 2) * Math.PI;
       return circleSquare;
    }

    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius)
    {
        double a = 4;
        double b = 3;
        double c = (a / b);
        double d = Math.pow(radius, 3);
        double pi = Math.PI;
        double sphereVolume = c * pi * d;
        return sphereVolume;
    }

    public static boolean isTriangleRightAngled(double a, double b, double c)
    {
        if (a + b <= c | a + c <= b | b + c <= a)
        {
            System.out.println("This triangle isn't possible");
            return false;
        }
        else
        {
            return true;
        }
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTriangleRightAngled, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c)
    {
        double triangleSquare;
        double p = (a + b + c) / 2;
        triangleSquare = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return triangleSquare;
    }
}
