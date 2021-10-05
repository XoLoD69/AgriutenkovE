package Lesson4;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        StringMassiv();
        PhoneBook();
    }

    public static void StringMassiv() {
        String[] arr = new String[]{
                "Слово", "Машина", "Орех", "Молоко",
                "Сыр", "Велосипед", "Ролики", "Имя",
                "Рыба", "Яблоко", "Кошка", "Собака",
                "Клубника", "Малина", "Яблоко",
                "Сыр", "Орех", "Кошка", "Яблоко"};
        System.out.println(Arrays.toString(arr));
        Set<String> set = new TreeSet<>(Arrays.asList(arr));
        System.out.println("Список уникальных слов: " + set);
        Map<String, Integer> hashMap = new HashMap<>();
        for (String str : arr) {
            Integer val = hashMap.get(str);
            hashMap.put(str, val == null ? 1 : val + 1);
        }
        hashMap.forEach((k, v) -> System.out.println(k + " = "  + v));
    }

    public static void PhoneBook() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Малинин", "+79232147777");
        phoneBook.add("Малинин", "+79232146666");
        phoneBook.add("Кошкин", "+79232141111");
        phoneBook.add("Егоров", "+79232142222");
        phoneBook.add("Кошкин", "+79232143333");
        phoneBook.add("Дятлов", "+79232149999");
        phoneBook.add("Собакин", "+79232144444");
        phoneBook.add("Уткин", "+79232145555");

        System.out.println(phoneBook);

        phoneBook.getPhone("Малинин");
        phoneBook.getPhone("Дятлов");
    }

}