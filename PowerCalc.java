import java.util.Scanner;

class PowerCalc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double volt, amp, watts;

        System.out.print("Enter voltage: ");
        volt = sc.nextDouble();

        System.out.print("Enter current (ampere): ");
        amp = sc.nextDouble();

        watts = volt * amp;

        System.out.println("Power in watts = " + watts);
    }
}
