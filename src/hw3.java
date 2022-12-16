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
    }
}
