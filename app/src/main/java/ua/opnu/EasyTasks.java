package ua.opnu;

import java.util.List;
import java.util.stream.Collectors;

public class EasyTasks {

    public static void main(String[] args) {
        // Для виконання лабораторної роботи необхідно написати вміст методів згідно умовам завдання,
        // після чого протестувати метод за допомогою тестів, які знаходяться в папці
        // src\test\TaskTest.java
    }

    // Завдання 1
    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
    }

    // Завдання 2
    public List<Integer> square(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    // Завдання 3
    public List<String> moreY(List<String> strings) {
        return strings.stream()
                .map(s -> "y" + s + "y")
                .collect(Collectors.toList());
    }

    // Завдання 4
    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
    }

    // Завдання 5
    public List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(n -> Math.abs(n) % 10 != 9)
                .collect(Collectors.toList());
    }

    // Завдання 6
    public List<String> noZ(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.contains("z"))
                .collect(Collectors.toList());
    }

    // Завдання 7
    public List<String> refinedStrings(List<String> strings) {
        return strings.stream()
                .distinct()
                .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length()))
                .collect(Collectors.toList());
    }

    // Завдання 8
    public List<String> flatten(List<String> strings) {
        return strings.stream()
                .flatMap(s -> List.of(s.split(" ")).stream())
                .collect(Collectors.toList());
    }
}