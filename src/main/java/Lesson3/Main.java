package Lesson3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

// Задание №1
        Something testSomething = new Something(1, 2.5, 3.5, "Четыре", "Пять");
        System.out.println(Arrays.toString(testSomething.getObjArr()));

        Something.reversArray(testSomething, 1, 4);
        System.out.println(Arrays.toString(testSomething.getObjArr()));

        Integer[] test1 = {1, 2, 3, 4, 5};
        String[] test2 = {"1", "2", "3", "4", "5"};
        Object[] test3 = {1, 2.5, 3.2, "Четыре", "Пять"};
        reversArray(test1, 2, 4);
        reversArray(test2, 2, 4);
        reversArray(test3, 2, 4);
        System.out.println(Arrays.toString(test1) + "\n" + Arrays.toString(test2) + "\n" + Arrays.toString(test3));

// Задание №2
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

//        ArrayList<Orange> listOfOrange = new ArrayList<>();
//        listOfOrange.add(new Orange());
//        listOfOrange.add(new Orange());
//        listOfOrange.add(new Orange());
//        Box<Orange> orangeBox = new Box<>();
//        Collections.addAll(orangeBox, listOfOrange);
        // Может подскажите в комменте, если не трудно, как нужно было написать, исходя из вашего примера коллекций на уроке?
        // А то я что-то не так понял видимо и так и не смог запустить с таким видом.

        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox1 = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        Collections.addAll(orangeBox, orange1, orange2, orange3);
        Collections.addAll(appleBox, apple1, apple2, apple3);
        Collections.addAll(appleBox1, apple4, apple5, apple6);
        Box.getInfoBox(appleBox);
        Box.getInfoBox(orangeBox);

        System.out.println("Сравнение коробок с разным весом - " + appleBox.compare(orangeBox));
        System.out.println("Сравнение коробок с одинаковым весом - " + appleBox.compare(appleBox1));

        appleBox.movingFruits(appleBox1);
        System.out.print("\nПересыпаем яблоки в другую коробку, в которой всего 3 яблока\nТеперь эта пустая:    ");
        Box.getInfoBox(appleBox);
        System.out.print("А в этой увеличилось количество яблок:    ");
        Box.getInfoBox(appleBox1);
        appleBox1.movingFruits(appleBox);
        System.out.print("\nТеперь пересыпаем обратно\nТеперь эта полная:    ");
        Box.getInfoBox(appleBox);
        System.out.print("А эта пустая:    ");
        Box.getInfoBox(appleBox1);

    }

    public static void reversArray(Object[] arr, int elem1, int elem2) {
        try {
            Object[] temp = new Object[1];
            temp[0] = arr[elem1];
            arr[elem1] = arr[elem2];
            arr[elem2] = temp[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nВыход за пределы массива!" + arr.getClass().getName());
        }
    }
}
