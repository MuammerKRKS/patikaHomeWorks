package hafta_5.recordClass;

// Main sınıfı, programın çalışacağı ana sınıf
public class Main {
    public static void main(String[] args) {
        // Öğrenci nesneleri oluşturuluyor
        Student student1 = new Student("Ali", "Yılmaz", 1001);
        Student student2 = new Student("Ayşe", "Kara", 1002);
        Student student3 = new Student("Mehmet", "Demir", 1003);

        // Öğrenci bilgilerini ekrana yazdırma
        // Record sınıflarında toString() otomatik olarak tanımlıdır
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        // equals ve hashCode metodlarının doğru çalıştığını test etme
        Student student4 = new Student("Ali", "Yılmaz", 1001);
        System.out.println("\nTest Equals ve HashCode:");
        System.out.println("student1 equals student4? " + student1.equals(student4)); // true
        System.out.println("student1 hashCode == student4 hashCode? " +
                (student1.hashCode() == student4.hashCode())); // true
    }

    // Öğrenci bilgilerini tutacak Record sınıfı
    // Record yapısı immutable'dır, yani nesne oluşturulduktan sonra değerleri değiştirilemez
    // Ayrıca equals, hashCode ve toString metodlarını otomatik sağlar
    record Student(String firstName, String lastName, int studentNumber) {
        // Buraya ekstra metod eklemeye gerek yok
    }
}
