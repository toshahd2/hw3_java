import java.util.ArrayList;
import java.util.Arrays;


public class hw3 {
    public static void main(String[] args) {
        //1. Создать новый список, добавить несколько строк и вывести коллекцию на экран.
        System.out.println("Задание 1");
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Добавили первую строку");
        stringList.add("Добавили вторую строку");
        stringList.add("Добавили третью строку");
        System.out.println(Arrays.toString(stringList.toArray()));

        //2. Итерация всех элементов списка цветов и добавления к каждому символа '!'.
        System.out.println("\nЗадание 2");
        String[] cmykArray = new String[]{"Cyan", "Magenta", "Yellow", "Key"};
        ArrayList<String> cmykList = new ArrayList<>();
        for (int i = 0; i < cmykArray.length; i++) {
            cmykList.add(cmykArray[i] + "!");
        }
        System.out.println(Arrays.toString(cmykList.toArray()));

        //3. Вставить элемент в список в первой позиции.
        System.out.println("\nЗадание 3");
        stringList.add(0, "Самая первая строка");
        System.out.println(Arrays.toString(stringList.toArray()));

        //4. Извлечь элемент (по указанному индексу) из заданного списка.
        System.out.println("\nЗадание 4");
        String extractedElement = stringList.remove(2);
        System.out.println(extractedElement);
    }
}
