package hafta_3;

public class GenericPrinter {

    // Generic printArray metodu
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); // Alt satıra geçmek için
    }

    // main metodu
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Java", "Generics", "Ödev"};

        printArray(intArray);
        printArray(strArray);
    }
}