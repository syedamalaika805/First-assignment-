import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Enter an integer number: ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }
}
