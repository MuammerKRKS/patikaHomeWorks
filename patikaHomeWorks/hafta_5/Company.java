package hafta_5;

public class Company {
    public static void main(String[] args) {
        // Yeni çalışan oluşturuluyor
        Employee emp1 = new Employee("Ahmet", "Yılmaz");

        // Çalışanın iletişim bilgilerini Inner Class üzerinden oluşturuyoruz
        Employee.ContactInfo emp1Contact = emp1.new ContactInfo("0555 123 45 67", "ahmet.yilmaz@example.com");

        // Çalışanın tüm bilgilerini ekrana yazdır
        emp1.showEmployeeInfo(emp1Contact);
    }
}

