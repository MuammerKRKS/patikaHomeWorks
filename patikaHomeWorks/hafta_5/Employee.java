package hafta_5;

// Çalışan bilgilerini tutan dış sınıf
public class Employee {
    private String firstName; // Çalışanın adı
    private String lastName;  // Çalışanın soyadı

    // Inner Class (İç Sınıf) -> İletişim bilgilerini tutacak
    public class ContactInfo {
        private String phoneNumber; // Telefon numarası
        private String email;       // E-posta adresi

        // Constructor: İletişim bilgilerini alır
        public ContactInfo(String phoneNumber, String email) {
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        // İletişim bilgilerini yazdıran metot
        public void showContactInfo() {
            System.out.println("Telefon: " + phoneNumber);
            System.out.println("E-posta: " + email);
        }
    }

    // Employee constructor
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Çalışan bilgilerini yazdıran metot
    public void showEmployeeInfo(ContactInfo contactInfo) {
        System.out.println("Çalışan: " + firstName + " " + lastName);
        contactInfo.showContactInfo(); // İç sınıftaki iletişim bilgilerini göster
    }
}
