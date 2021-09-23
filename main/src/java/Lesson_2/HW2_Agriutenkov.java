package Lesson_2;

public class HW2_Agriutenkov {

        public final int SIZE = 4;

        public static void main(String[] args) {
//        String array[][] = {
//                {"1", "1", "1", "1"},
//                {"1", "1", "1", "1"},
//                {"1", "1", "1", "1"},
//                {"1", "1", "1", "1", "один"}
//        };
            String array[][] = {
                    {"1", "1", "1", "1"},
                    {"1", "1", "1", "1"},
                    {"1", "1", "1", "1"},
                    {"1", "1", "1", "два"}
            };
//        String array[][] = { // правильный массив
//                {"1", "1", "1", "1"},
//                {"1", "1", "1", "1"},
//                {"1", "1", "1", "1"},
//                {"1", "1", "1", "1"}
//        };
//        String array[][] = {
//                {"1", "1", "1", "1"},
//                {"1", "1", "1", "1"},
//                {"1", "1", "1", "1"}
//        };

            HW2_Agriutenkov m = new HW2_Agriutenkov();
            try {
                m.verifyArray(array);
            } catch (MyArraySizeException | MyArrayDataException ex) {
                System.out.println(ex.getMessage());

            }
        }

        public void verifyArray(String[][] arr) throws MyArrayDataException, MyArraySizeException {
// отрабатываем исключение MyArraySizeException
            for (int i = 0; i < SIZE; i++) {
                if (arr.length != SIZE || arr[i].length != SIZE)
                    throw new MyArraySizeException("Размер массива не 4х4 !!!");
            }
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
// отрабатываем исключение MyArrayDataException
                    try {
                        sum += Integer.parseInt(arr[i][j]);
                    } catch (Exception ex) {
                        throw new MyArrayDataException("В ячейке [" + i + "][" + j + "] лежит не число !!!");
                    }
                }
            }
            System.out.println("Сумма массива = " + sum);
        }
}
