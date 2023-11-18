import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            showMenu();
            System.out.print("Pilih operasi (1/2/3/4/5): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    squareRootOperation(scanner);
                    break;
                case 2:
                    powerOperation(scanner);
                    break;
                case 3:
                    logarithmOperation(scanner);
                    break;
                case 4:
                    factorialOperation(scanner);
                    break;
                case 5:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (choice != 5);
    }

    private static void showMenu() {
        System.out.println("=== Calculator ===");
        System.out.println("1. Akar Kuadrat");
        System.out.println("2. Pangkat");
        System.out.println("3. Logaritma");
        System.out.println("4. Faktorial");
        System.out.println("5. Keluar");
    }

    private static void squareRootOperation(Scanner scanner) {
        System.out.print("Masukkan angka: ");
        double number = scanner.nextDouble();
        double result = Math.sqrt(number);
        System.out.println("Akar kuadrat dari " + number + " adalah: " + result);
    }

    private static void powerOperation(Scanner scanner) {
        System.out.print("Masukkan angka: ");
        double base = scanner.nextDouble();
        System.out.print("Masukkan eksponen: ");
        double exponent = scanner.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println(base + " pangkat " + exponent + " adalah: " + result);
    }

    private static void logarithmOperation(Scanner scanner) {
        System.out.print("Masukkan angka: ");
        double number = scanner.nextDouble();
        double result = Math.log10(number);
        System.out.println("Logaritma basis 10 dari " + number + " adalah: " + result);
    }

    private static void factorialOperation(Scanner scanner) {
        System.out.print("Masukkan angka: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Faktorial tidak dapat dihitung untuk angka negatif.");
        } else {
            long result = calculateFactorial(number);
            System.out.println("Faktorial dari " + number + " adalah: " + result);
        }
    }

    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
