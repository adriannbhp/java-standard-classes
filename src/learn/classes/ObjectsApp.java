package learn.classes;

import java.util.Objects;

/**
 * Objects Class
 * - Awas jangan tertukar, ini class Objects, bukan Object
 * - Objects adalah class utility yang berisikan banyak static method bisa kita gunaka
 *   untuk operasi Object atau melakukan pengecekan sebelum operasi nya dilakukan
 */
public class ObjectsApp {

    public static class Data {
        private String data;

        public Data(String data) {
            this.data = data;
        }
        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Data data1 = (Data) o;
            return Objects.equals(data, data1.data);
        }

        @Override
        public int hashCode() {
            return Objects.hash(data);
        }

        @Override
        public String toString() {
            return "Data{" +
                    "data='" + data + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {

        execute(new Data("Adrian"));

    }

    public static void execute(Data data) {

//        if(data != null) {
//            System.out.println(data.toString());
//            System.out.println(data.hashCode());
//        }

        // Menggunakan Objects
        System.out.println(Objects.toString(data));
        System.out.println(Objects.hashCode(data));
    }
}
