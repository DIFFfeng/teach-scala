package com.bigdata;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private List<Integer> scores;

    public Student(String name, List<Integer> scores) {
        this.name = name;
        this.scores = scores;
    }

    public String getName() { return name; }
    public List<Integer> getScores() { return scores; }
    public double getAverage() {
        return scores.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
    }
    public int getTotal() {
        return scores.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}

public class TestLen {
    public static void main(String[] args) {
        // 创建学生列表
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", List.of(85, 90, 95)));
        students.add(new Student("Bob", List.of(75, 80, 85)));
        students.add(new Student("Charlie", List.of(95, 95, 98)));

        // 筛选平均分>80并按总分排序
        List<Student> result = students.stream()
                .filter(s -> s.getAverage() > 80)
                .sorted(Comparator.comparingInt(Student::getTotal).reversed())
                .toList();

        // 输出结果
        result.forEach(s -> System.out.printf(
                "%s: 平均分=%.1f, 总分=%d%n",
                s.getName(), s.getAverage(), s.getTotal()
        ));
    }
}