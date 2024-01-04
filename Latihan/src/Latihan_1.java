import java.util.Scanner;

public class Latihan_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Calculator ===");
            System.out.println("1. Akar Kuadrat");
            System.out.println("2. Pangkat");
            System.out.println("3. Logaritma");
            System.out.println("4. Faktorial");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi (1/2/3/4/5): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    squareRoot();
                    break;
                case 2:
                    power();
                    break;
                case 3:
                    logarithm();
                    break;
                case 4:
                    factorial();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Opsi tidak valid. Silakan pilih lagi.");
            }
        }
    }

    private static void squareRoot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        double number = scanner.nextDouble();

        if (number < 0) {
            System.out.println("Akar kuadrat dari bilangan negatif tidak dapat dihitung.");
        } else {
            double result = Math.sqrt(number);
            System.out.println("Hasil akar kuadrat dari " + number + " adalah " + result);
        }
    }

    private static void power() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        double base = scanner.nextDouble();
        System.out.print("Masukkan pangkat: ");
        double exponent = scanner.nextDouble();

        double result = Math.pow(base, exponent);
        System.out.println("Hasil dari " + base + " pangkat " + exponent + " adalah " + result);
    }

    private static void logarithm() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        double number = scanner.nextDouble();

        if (number <= 0) {
            System.out.println("Logaritma dari angka non-positif tidak dapat dihitung.");
        } else {
            double result = Math.log(number);
            System.out.println("Hasil logaritma natural dari " + number + " adalah " + result);
        }
    }

    private static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Faktorial dari bilangan negatif tidak dapat dihitung.");
        } else {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            System.out.println("Hasil faktorial dari " + n + " adalah " + result);
        }
    }
}
