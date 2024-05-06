package learn.classes;

import java.math.BigInteger;

/**
 * Big Number
 * - Jika kita ada kebutuhan untuk menggunakan angka yang besar sehingga melebihi kapasitas
 *   Long dan Double, di Java sudah disediakan class untuk handle data besar tersebut
 * - BigInteger adalah class untuk handle tipe data Integer, dan
 * - BigDecimal adalah class untuk handle tipe data floating point
 *
 * Method di BigInteger & BigDecimal
 * Method                       Operator
 * - add                        +
 * - subtract                   -
 * - multiply                   *
 * - divide                     /
 * - mod                        %
 * - dan masih banyak lagi
 */

public class BigNumberApp {
    public static void main(String[] args) {

        BigInteger a = new BigInteger("1000000000000000000");
        BigInteger b = new BigInteger("1000000000000000000");

        BigInteger c = a.add(b);
        BigInteger d = a.subtract(b);
        BigInteger e = a.multiply(b);
        BigInteger f = a.divide(b);
        BigInteger g = a.mod(b);

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}
