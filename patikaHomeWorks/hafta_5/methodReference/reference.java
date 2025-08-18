package hafta_5.methodReference;
import java.util.ArrayList;
import java.util.List;

public class reference {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Ahmet");
        names.add("Ayşe");
        names.add("Mehmet");
        names.add("Zeynep");

        // for döngüsü yerine method reference kullandık
        names.forEach(System.out::println);
    }
}
