package hafta_3;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class FindingTheTwoClosestNumbers {
    public static void main(String[] args) {
        TreeSet<Integer>numbers = new TreeSet<>(); // TreeSet ile istenilen 10 adet pozitif sayıyı alıyoruz.
        numbers.add(3999);
        numbers.add(666);
        numbers.add(250);
        numbers.add(500);
        numbers.add(1133);
        numbers.add(3311);
        numbers.add(1313);
        numbers.add(3131);
        numbers.add(875);
        numbers.add(4000);

        List<Integer> list = new ArrayList<>(numbers); // TreeSet'i ArrayList içerisine aktarıyoruz
        int minDiff =Integer.MAX_VALUE;
        int num1 = 0, num2 = 0;

        for (int i = 0; i < list.size() - 1; i++) {
            int diff = list.get(i + 1) - list.get(i); /*sırayla iki komşu sayı alıyoruz. list.get(i) mevcut sayı - list.get(i + 1) bir sonraki sayı.
                                                       Farklarını alıp en küçük sayıyı buluyoruz */

            if (diff < minDiff){  // sayılar araasında bulunan farkları burada güncelleyip nihai sonuca ulaşıyoruz.
                minDiff = diff;
                num1 = list.get(i);
                num2 = list.get(i + 1);

            }
        }
        System.out.println("Birbirine en yakın sayılar: " + num1 + " ve " + num2);
        System.out.println("Farkları: " + minDiff);
    }
}
