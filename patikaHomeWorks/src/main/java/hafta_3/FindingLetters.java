package hafta_3;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class FindingLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> letters = new ArrayList<>(); // istenilen 4 adet harfi alıyoruz
        letters.add("a");
        letters.add("ğ");
        letters.add("d");
        letters.add("k");

        for (int i = 0; i < 4; i++) {
            System.out.println("Harf Giriniz: ");
            String input = scanner.next().toLowerCase(); //karşılaştırması için küçük harfe çeviriyoruz

            if (letters.contains(input)) { //harfin indeksini buluyoruz
                int index = letters.indexOf(input);
                letters.set(index, "found"); // eğer harf var ise found ile değiştiriyoruz.

            }else letters.add(input); // harf yok ise harfi ekliyoruz
        }
        System.out.println("Güncellenmiş liste: " + letters);
    }
}
