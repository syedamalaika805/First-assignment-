import java.util.Scanner;

class TrapezoidArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, h, area;

        System.out.print("Enter first parallel side: ");
        a = sc.nextDouble();

        System.out.print("Enter second parallel side: ");
        b = sc.nextDouble();

        System.out.print("Enter height: ");
        h = sc.nextDouble();

        area = h * (a + b) / 2;

        System.out.println("Area of trapezoid = " + area);
    }
}
