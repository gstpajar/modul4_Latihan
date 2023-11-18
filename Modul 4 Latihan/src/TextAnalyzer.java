import java.util.Scanner;

public class TextAnalyzer {
    private static String inputText = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            showMenu();
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline dari buffer

            switch (choice) {
                case 1:
                    enterText(scanner);
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
                    System.out.println("Terima kasih telah menggunakan program Teks Analisis!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (choice != 5);
    }

    private static void showMenu() {
        System.out.println("=== MENU TEKS ANALYZER ===");
        System.out.println("1. Masukkan Teks");
        System.out.println("2. Hitung Jumlah Karakter");
        System.out.println("3. Hitung Jumlah Kata");
        System.out.println("4. Cari Kata dalam Teks");
        System.out.println("5. Keluar");
    }

    private static void enterText(Scanner scanner) {
        System.out.print("Masukkan teks: ");
        inputText = scanner.nextLine();
        System.out.println("Teks telah dimasukkan!");
    }

    private static void countCharacters() {
        int charCount = inputText.length();
        System.out.println("Jumlah karakter dalam teks: " + charCount);
    }

    private static void countWords() {
        String[] words = inputText.split("\\s+");
        int wordCount = words.length;
        System.out.println("Jumlah kata dalam teks: " + wordCount);
    }

    private static void searchWord(Scanner scanner) {
        System.out.print("Masukkan kata yang ingin dicari: ");
        String searchWord = scanner.nextLine();

        int occurrences = countOccurrences(searchWord);
        System.out.println("Kata '" + searchWord + "' ditemukan sebanyak " + occurrences + " kali dalam teks.");
    }

    private static int countOccurrences(String searchWord) {
        int count = 0;
        String[] words = inputText.split("\\s+");
        for (String word : words) {
            if (word.equalsIgnoreCase(searchWord)) {
                count++;
            }
        }
        return count;
    }
}

