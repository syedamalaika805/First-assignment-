import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c, s, area;

        System.out.print("Enter first side: ");
        a = sc.nextDouble();

        System.out.print("Enter second side: ");
        b = sc.nextDouble();

        System.out.print("Enter third side: ");
        c = sc.nextDouble();

        s = (a + b + c) / 2;

        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Area of triangle = " + area);
    }
}
