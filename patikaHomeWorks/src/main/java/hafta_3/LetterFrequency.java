package hafta_3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LetterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Kelime giriniz: ");
        String letter = scanner.nextLine().toLowerCase(); // tüm harfleri küçültüyoruz.


        Map<Character, Integer> letterNumbers = new LinkedHashMap<>(); // kelimeyi yazdığım sıra ile çıkartması için 'LinkedHashMap' kullanıyorum.
        for (char ch : letter.toCharArray()) {
            if (Character.isLetter(ch)) // burada sadece harf olanları say diyoruz.
            {
                letterNumbers.put(ch, letterNumbers.getOrDefault( ch,0 ) + 1);
            }
        }
        for (Map.Entry< Character , Integer > entry: letterNumbers.entrySet())
        {
            System.out.println(entry.getKey() + " harfi " + entry.getValue() + " kez geçiyor.");
        }
    }
}