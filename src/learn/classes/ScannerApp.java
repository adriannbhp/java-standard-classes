package learn.classes;

import java.util.Scanner;

/**
 * Scanner Class
 * - Scanner sebenarnya bagian dari Java IO (Input Output), dan ini akan dibahas di
 *   materi terpisah
 * - Namun sekarang kita akan bahas sekilas tentang class Scanner
 * - Class Scanner hadir sejak Java 5
 * - Class Scanner adalah class yang bisa digunakan untuk membaca input, entah dari file, console
 *   dan lain-lain
 * - Class Scanner ini cocok untuk dijadikan object untuk membaca input user saat kita belajar
 *   membuat program Java menggunakan console/terminal
 *
 * Method di Scanner Class
 * Method                   Keterangan
 * - nextLine()             - Membaca string
 * - nextInt()              - Membaca int
 * - nextLong()             - Membaca long
 * - nextBoolean()          - Membaca boolean
 * - ...dan masih banyak
 */
public class ScannerApp {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Nama : ");
        String name = scanner.nextLine();

        System.out.println("Umur : ");
        Integer age = scanner.nextInt();

        System.out.println("Hello " + name + " Umur anda adalah " + age);
    }
}
