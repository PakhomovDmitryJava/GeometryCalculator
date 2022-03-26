public class Main {
    public static void main(String[] args)
    {
        System.out.println("Circle Square");
        System.out.println(GeometryCalculator.getCircleSquare(3d));
        System.out.println(GeometryCalculator.getCircleSquare(-5));
        System.out.println(GeometryCalculator.getCircleSquare(6.56));


        System.out.println("\nSphere Volume");
        System.out.println(GeometryCalculator.getSphereVolume(2));
        System.out.println(GeometryCalculator.getSphereVolume(57.6));
        System.out.println(GeometryCalculator.getSphereVolume(0));

        /*
        System.out.println("\nis Triangle Right");
        System.out.println(GeometryCalculator.isTriangleRightAngled(4.0, 10.0, 5.0));
        System.out.println(GeometryCalculator.isTriangleRightAngled(7.0, 7.0, 8.10));
        System.out.println(GeometryCalculator.isTriangleRightAngled(4.0, 7.0, 8.10));
        */

        System.out.println("\nTriangle Square");
        if (GeometryCalculator.isTriangleRightAngled(4.0, 10.0, 5.0) == true)
        {
            System.out.println(GeometryCalculator.getTriangleSquare(4.0, 10.0, 5.0));
        }
        if (GeometryCalculator.isTriangleRightAngled(7.0, 7.0, 8.10) == true)
        {
            System.out.println(GeometryCalculator.getTriangleSquare(7.0, 7.0, 8.10));
        }
        if (GeometryCalculator.isTriangleRightAngled(4.0, 7.0, 8.10) == true)
        {
            System.out.println(GeometryCalculator.getTriangleSquare(4.0, 7.0, 8.10));
        }
    }
}
