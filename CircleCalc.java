import java.util.Scanner;

class circlearea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double r, area, circum;

        System.out.print("Enter radius of circle: ");
        r = sc.nextDouble();

        area = 3.14 * r * r;
        circum = 2 * 3.14 * r;

        System.out.println("Area = " + area);
        System.out.println("r" );
    }
}
