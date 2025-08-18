package hafta_5;

// Haftanın günlerini ve çalışma saatlerini tutan Enum sınıfı
public enum Day {
    // Her gün için sabit tanımları ve çalışma saatleri
    SUNDAY("Çalışma yok"),
    MONDAY("09:00 - 17:00"),
    TUESDAY("09:00 - 17:00"),
    WEDNESDAY("09:00 - 17:00"),
    THURSDAY("09:00 - 17:00"),
    FRIDAY("09:00 - 17:00"),
    SATURDAY("Çalışma yok");

    // Her gün için çalışma saatini saklayan değişken
    private final String workHours;

    // Enum sabitlerine çalışma saatlerini atayan constructor
    Day(String workHours) {
        this.workHours = workHours;
    }

    // Çalışma saatini döndüren getter metodu
    public String getWorkHours() {
        return workHours;
    }
}
