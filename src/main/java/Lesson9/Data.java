package Lesson9;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Data {

    public static List<Student> getStudentsList() {

        Course course1 = new Course("Java. Level 1");
        Course course2 = new Course("Java Core для тестировщиков");
        Course course3 = new Course("Введение в тестирование");
        Course course4 = new Course("Введение в тестирование. Практикум");
        Course course5 = new Course("Основы баз данных");
        Course course6 = new Course("Linux. Рабочая станция");
        Course course7 = new Course("Тестирование веб-приложений");
        Course course8 = new Course("Тестирование мобильных приложений");
        Course course9 = new Course("Английский для IT-специалистов");
        Course course10 = new Course("Автоматизация тестирования Web UI на Java");
        Course course11 = new Course("Тестирование backend на Java");
        Course course12 = new Course("Git. Базовый курс");

        Student student1 = new Student("Александр Александров", Arrays.asList(course1, course3, course5));
        Student student2 = new Student("Михаил Михайлов", Arrays.asList(course1, course2, course3));
        Student student3 = new Student("Дмитрий Дмитриев", Arrays.asList(course1, course7, course11));
        Student student4 = new Student("Макар Макаров", Arrays.asList(course2, course4, course8, course1, course3));
        Student student5 = new Student("Константин Константинов", Arrays.asList(course3, course7, course9));
        Student student6 = new Student("Антон Антонов", Arrays.asList(course1, course3, course5));
        Student student7 = new Student("Василий Васильев", Arrays.asList(course2, course6, course7));
        Student student8 = new Student("Алексей Алексеев", Arrays.asList(course3, course2, course4));
        Student student9 = new Student("Ксения Ксенина", Arrays.asList(course4, course8, course5));
        Student student10 = new Student("Михаил Михайлов", Arrays.asList(course5, course1, course9));
        Student student11 = new Student("Виктор Викторов", Arrays.asList(course6, course9, course5));
        Student student12 = new Student("Ирина Иринина", Arrays.asList(course7, course6, course5));
        Student student13 = new Student("Евгений Евгеньев", Arrays.asList(course8, course1, course5));
        Student student14 = new Student("Даниил Данилин", Arrays.asList(course9, course2, course5));
        Student student15 = new Student("Сергей Сергеев", Arrays.asList(course10, course3, course1));
        Student student16 = new Student("Николай Николаев", Arrays.asList(course11, course9, course2));
        Student student17 = new Student("Федор Федоров", Arrays.asList(course12, course8, course3));
        Student student18 = new Student("Олег Олегов", Arrays.asList(course11, course7, course4));
        Student student19 = new Student("Иван Иванов", Arrays.asList(course10, course6, course5));
        Student student20 = new Student("Петр Петров", Arrays.asList(course9, course5, course3));



        return Arrays.asList(student1, student2, student3, student4, student5, student6, student7,
                student8, student9, student10, student11, student12, student13, student14,
                student15, student16, student17, student18, student19, student20);
    }

    public static Course getRandomCourse() {
        Random random = new Random();
        List<String> courses = Arrays.asList("Java. Level 1", "Java Core для тестировщиков", "Введение в тестирование",
                "Введение в тестирование. Практикум", "Основы баз данных", "Linux. Рабочая станция", "Тестирование веб-приложений",
                "Тестирование мобильных приложений", "Английский для IT-специалистов", "Автоматизация тестирования Web UI на Java",
                "Тестирование backend на Java", "Git. Базовый курс");
        return new Course(courses.get(random.nextInt(courses.size())));
    }
}
