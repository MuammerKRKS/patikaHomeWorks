package hafta_5;

import java.util.Scanner;

public class WeeklySchedule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir gün isteniyor
        System.out.println("Bir gün giriniz (örn: MONDAY, TUESDAY...): ");
        String input = scanner.nextLine().toUpperCase(); // Küçük harf girilirse sorun olmasın diye büyük harfe çeviriyoruz

        try {
            // Kullanıcının girdiği gün, Day enum'undaki sabitlerden birine dönüştürülüyor
            Day selectedDay = Day.valueOf(input);

            // Seçilen günün çalışma saatleri ekrana yazdırılıyor
            System.out.println(selectedDay + " günü çalışma saatleri: " + selectedDay.getWorkHours());
        } catch (IllegalArgumentException e) {
            // Kullanıcı yanlış bir gün girdiğinde hata mesajı veriliyor
            System.out.println("Geçersiz gün girdiniz! Lütfen MONDAY, TUESDAY... gibi yazın.");
        }
    }
}

