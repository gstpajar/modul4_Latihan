# modul4_Latihan1
Program ini adalah kalkulator java sederhana dengan library Math API yang memungkinkan pengguna untuk melakukan beberapa operasi matematika dasar. Berikut adalah penjelasan singkat dari setiap bagian program:

1. **Main Method (`public static void main(String[] args)`)**
   - Program dimulai dengan mendeklarasikan objek `Scanner` untuk membaca input dari pengguna.
   - Menggunakan loop `do-while` untuk menampilkan menu operasi dan meminta pengguna memilih operasi yang diinginkan.
   - Menggunakan `switch` statement untuk memanggil metode yang sesuai berdasarkan pilihan pengguna.
   - Loop berlanjut hingga pengguna memilih untuk keluar (pilihan 5).

2. **Menu Method (`private static void showMenu()`)**
   - Menampilkan menu operasi kalkulator ke layar.

3. **Square Root Operation Method (`private static void squareRootOperation(Scanner scanner)`)**
   - Meminta pengguna memasukkan angka dan menghitung akar kuadratnya menggunakan `Math.sqrt()`.

4. **Power Operation Method (`private static void powerOperation(Scanner scanner)`)**
   - Meminta pengguna memasukkan basis dan eksponen, lalu menghitung hasil pangkat menggunakan `Math.pow()`.

5. **Logarithm Operation Method (`private static void logarithmOperation(Scanner scanner)`)**
   - Meminta pengguna memasukkan angka dan menghitung logaritma basis 10 menggunakan `Math.log10()`.

6. **Factorial Operation Method (`private static void factorialOperation(Scanner scanner)`)**
   - Meminta pengguna memasukkan angka dan menghitung faktorial menggunakan metode rekursif (`calculateFactorial`).
   - Program memberikan pesan kesalahan jika pengguna mencoba menghitung faktorial dari angka negatif.

7. **Factorial Calculation Method (`private static long calculateFactorial(int n)`)**
   - Metode rekursif yang menghitung faktorial dari suatu angka.

#modul4_latihan2
Program ini adalah program Java sederhana dengan library Math API yang disebut "TextAnalyzer". Fungsinya adalah untuk menganalisis teks yang dimasukkan oleh pengguna. Berikut adalah penjelasan dari setiap bagian program:

1. **Main Method (`public static void main(String[] args)`)**
   - Program dimulai dengan mendeklarasikan objek `Scanner` untuk membaca input dari pengguna.
   - Menggunakan loop `do-while` untuk menampilkan menu dan meminta pengguna memilih opsi analisis teks yang diinginkan.
   - Switch statement digunakan untuk memanggil metode yang sesuai berdasarkan pilihan pengguna.
   - Loop terus berlanjut hingga pengguna memilih untuk keluar (pilihan 5).

2. **Menu Method (`private static void showMenu()`)**
   - Menampilkan menu pilihan analisis teks ke layar.

3. **Enter Text Method (`private static void enterText(Scanner scanner)`)**
   - Meminta pengguna untuk memasukkan teks dan menyimpannya dalam variabel `inputText`.

4. **Count Characters Method (`private static void countCharacters()`)**
   - Menghitung jumlah karakter dalam teks dengan menggunakan metode `length()` pada string.

5. **Count Words Method (`private static void countWords()`)**
   - Menghitung jumlah kata dalam teks dengan menggunakan `split("\\s+")` untuk membagi teks menjadi array kata.

6. **Search Word Method (`private static void searchWord(Scanner scanner)`)**
   - Meminta pengguna untuk memasukkan kata yang ingin dicari dalam teks.
   - Menggunakan metode `countOccurrences` untuk menghitung berapa kali kata tersebut muncul dalam teks.

7. **Count Occurrences Method (`private static int countOccurrences(String searchWord)`)**
   - Menghitung berapa kali suatu kata muncul dalam teks dengan menggunakan loop dan membandingkan kata secara tidak bersifat case-sensitive.

Program ini memberikan pengguna kemampuan untuk memasukkan teks, kemudian melakukan beberapa analisis sederhana seperti menghitung jumlah karakter, jumlah kata, dan mencari berapa kali suatu kata muncul dalam teks.
