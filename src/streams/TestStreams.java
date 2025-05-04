package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestStreams {

    private static final List<Student> students = new ArrayList<>();
    private static final List<List<Student>> listOfStudents = new ArrayList<>();

    public static void main(String[] args) {
        Student student = new Student("luis", "1", 10, 28);
        Student student2 = new Student("chore", "1", 8, 22);
        Student student3 = new Student("dubo", "2", 9, 14);
        Student student4 = new Student("chorejin", "2", 6, 21);
        Student student5 = new Student("edmano", "3", 7, 24);
        Student student6 = new Student("dubaldo", "3", 7, 18);

        students.add(student);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        listOfStudents.add(students);

        //testStudents();
        //exercisesEasy();
        //exercisesMedium();
        //exercisesHard();
        practice();

    }

    public static void practice() {

        List<Integer> numbers = Arrays.asList(3, 5, 9, 12, 4);
        int max = numbers.stream()
                .max((o1, o2) -> o1.compareTo(o2)).get();
        System.out.println(max);

        List<String> fruits = Arrays.asList("apple", "banana", "cherry");
        List<String> fruitsMayus = fruits.stream()
                .map(fruit -> fruit.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(fruitsMayus);

        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers2.stream()
                .map( num -> num*num)
                .filter(num -> num%2 == 1)
                .reduce((integer, integer2) -> integer+integer2).get();
        System.out.println(sum);

        List<String> words = Arrays.asList("Java", "java", "Stream", "stream", "Stream");
        long wordsDistinc = words.stream()
                .map(String::toUpperCase)
                .distinct()
                .count();
        System.out.println(wordsDistinc);

        List<String> items = Arrays.asList("pen", "pencil", "eraser");
        String item = items.stream()
                .collect(Collectors.joining(","));
        System.out.println(item);

        List<String> words2 = Arrays.asList("cat", "elephant", "dog", "rhino");
        Map<Integer, List<String>> res = words2.stream().collect(Collectors.groupingBy(s -> s.length()));
        System.out.println(res);

    }

    private static void exercisesHard() {

        //Problem: Given a list of words, find the longest word.
        List<String> words = Arrays.asList("Stream", "Lambda", "Functional", "Programming");

        String longest = words.stream().max((w1,w2) -> Integer.compare(w1.length(), w2.length())).get();
        System.out.println(longest);

        //Problem: Given a list of names, group them by their first letter.
        List<String> names = Arrays.asList("Alice", "Adam", "Bob", "Charlie", "Chris");



    }

    private static void exercisesMedium() {
        //Problem: Given a list of numbers, return a new list with duplicates removed.
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> numbersDuplicates = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(numbersDuplicates);

        //Problem: Given a list of words, count how many start with the letter 'A'.
        List<String> words = Arrays.asList("Apple", "Banana", "Avocado", "Apricot", "Blueberry");
        long count = words.stream()
                .filter(word -> word.startsWith("A"))
                .count();
        System.out.println(count);

        //Problem: Given a list of numbers, find the sum of all odd numbers.
        List<Integer> numbersOdd = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int sum = numbersOdd.stream()
                .filter(num -> num%2 == 1)
                .reduce((n1,n2) -> n1+n2).get();
        System.out.println(sum);

        //Problem: Given a list of lists, return a single list with all elements.
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        List<Integer> list = nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(list);

    }

    public static void exercisesEasy() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //Problem: Given a list of integers, return a new list containing only the even numbers.

        List<Integer> even = numbers.stream()
                .filter(num -> num%2 == 0)
                .collect(Collectors.toList());
        System.out.println(even);

        //Problem: Given a list of strings, return a new list with all elements in uppercase.
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        List<String> wordsUpperCase = words.stream()
                .map(element -> element.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(wordsUpperCase);

        //Problem: Given a list of numbers, find the first number greater than 50.
        List<Integer> numbersList = Arrays.asList(10, 25, 60, 45, 80);
        int greater = numbersList.stream().filter(num -> num > 50).findFirst().get();
        System.out.println(greater);

    }

    public static void testStudents() {

        List<String> names = students.stream()
                .map( student -> student.getName())
                .filter(student -> student.startsWith("c"))
                .collect(Collectors.toList());

        System.out.println(names);

        List<Integer> grades = students.stream()
                .map(Student::getGrade)
                .sorted()
                .limit(4)
                .peek( peek -> System.out.println(peek))
                .skip(1)
                .distinct()
                .collect(Collectors.toList());

        int sum = grades.stream()
                        .reduce((n1, n2) ->  n1+n2).get();

        int min = grades.stream().min((o1, o2) -> o1-o2).get();

        System.out.println(grades);
        System.out.println(sum);
        System.out.println(min);

        List<Student> studentList = listOfStudents.stream()
                .flatMap(students -> students.stream())
                .filter(student -> student.getGrade() > 8)
                .collect(Collectors.toList());

        System.out.println(studentList);

    }
}

class Student {
    private String name;
    private String group;
    private int grade;
    private int age;

    public Student(String name, String group, int grade, int age) {
        this.name = name;
        this.group = group;
        this.grade = grade;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", grade=" + grade +
                ", age=" + age +
                '}';
    }
}