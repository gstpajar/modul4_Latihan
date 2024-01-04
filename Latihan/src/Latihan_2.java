import java.util.Scanner;

public class Latihan_2 {
    private static String text = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== MENU TEKS ANALYZER ===");
            System.out.println("1. Masukkan Teks");
            System.out.println("2. Hitung Jumlah Karakter");
            System.out.println("3. Hitung Jumlah Kata");
            System.out.println("4. Cari Kata dalam Teks");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline character

            switch (choice) {
                case 1:
                    inputText(scanner);
                    break;
                case 2:
                    countCharacters();
                    break;
                case 3:
                    countWords();
                    break;
                case 4:
                    searchWord(scanner);
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Opsi tidak valid. Silakan pilih lagi.");
            }
        }
    }

    private static void inputText(Scanner scanner) {
        System.out.print("Masukkan teks: ");
        text = scanner.nextLine();
        System.out.println("Teks telah dimasukkan!");
    }

    private static void countCharacters() {
        int characterCount = text.length();
        System.out.println("Jumlah karakter: " + characterCount);
    }

    private static void countWords() {
        String[] words = text.split("\\s+");
        int wordCount = words.length;
        System.out.println("Jumlah kata: " + wordCount);
    }

    private static void searchWord(Scanner scanner) {
        System.out.print("Masukkan kata yang ingin dicari: ");
        String targetWord = scanner.nextLine();

        int occurrences = 0;
        String[] words = text.split("\\s+");

        for (String word : words) {
            if (word.equalsIgnoreCase(targetWord)) {
                occurrences++;
            }
        }

        System.out.println("Kata '" + targetWord + "' ditemukan sebanyak " + occurrences + " kali.");
    }
}
