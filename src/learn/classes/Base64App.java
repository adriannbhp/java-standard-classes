package learn.classes;

import java.util.Base64;

/**
 * Base64 Class
 * - Sejak Java 8, Java sudah menyediakan class untuk melakukan encoding base64
 * - Buat programmer web pasti tahu tentang base64, yaitu encoding yang bisa digunakan untuk
 *   mengubah binary data ke text yang aan
 * - Aman disini bukan dari sisi security, tapi aman dari kesalahan parsing
 */

public class Base64App {
    public static void main(String[] args) {

        String original = "Adrian Bimo Hernawan Pratama";

        // Encoded
        String encoded = Base64.getEncoder().encodeToString(original.getBytes());
        System.out.println(encoded);

        // Decoded, tapi hasilnya byte
        byte[] bytes = Base64.getDecoder().decode(encoded);
        // konversi dari byte ke string
        String result = new String(bytes);

        System.out.println(result);
    }
}
