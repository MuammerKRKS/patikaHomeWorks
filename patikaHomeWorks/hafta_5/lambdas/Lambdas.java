package hafta_5.lambdas;

import java.util.ArrayList;
import java.util.List;

public class Lambdas {
    public static void main(String[] args) {
        // 1. Liste oluşturma
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // 2. Sayıları iki katına çıkarma (Lambda kullanarak)
        // replaceAll -> listedeki her elemanı alıp lambda ifadesi ile günceller
        // "n -> n * 2" ifadesi: her elemanı al, 2 ile çarp ve geri döndür demek.
        numbers.replaceAll(n -> n * 2);

        // 3. Sonuçları yazdırma (Lambda kullanarak)
        // forEach  listedeki her elemanı tek tek alır ve verilen işlemi uygular
        numbers.forEach(n -> System.out.println(n));

        // Alternatif olarak method reference (daha kısa hali):
        // numbers.forEach(System.out::println);
    }

}
