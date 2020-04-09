package taskTest;

import java.util.*;

public class Task_1 {
    public double task_1(List<Integer> list) {
        /** 1.	Дан список целых чисел. Найти среднее всех нечётных чисел, делящихся на 5.*/
        double average = list.stream()
                .filter((i -> i % 5 == 0))
                .filter((i -> i % 2 != 0))
                .mapToInt(x -> x)
                .average()
                .getAsDouble();
        return average;
    }
    /**2.Дан список строк. Найти количество уникальных строк длиной более 8 символов.*/
    public double task_2(List<String> list1) {
        long line = list1.stream()
                .filter(s -> s.length() > 8)
                .distinct()
                .count();
        return line;
    }

    /**3.	Дана Map<String, Integer>. Найти сумму всех значений, длина ключей которых меньше 7 символов.*/
    public double task_3(Map<String, Integer> map) {
    int sum = map.entrySet()
            .stream()
            .filter(e -> e.getKey().length() < 7)
            .mapToInt(s->s.getValue())
            .sum();
    return sum;
    }
    /** 4.Дан список целых чисел, вывести строку, представляющую собой конкатенацию строковых представлений этих чисел.
     Пример: список {5, 2, 4, 2, 1}
     Результирующая строка: "52421" */
    public String task_4(List<Integer> list) {
        String string = list.stream()
                .map(e -> e.toString())
                .reduce("", String::concat);
        return string;
    }
    /**5.Дан класс Person с полями firstName, lastName, age.
     Вывести полное имя самого старшего человека, у которого длина этого имени не превышает 15 символов. */
    public Optional<Person> task_5 (List<Person> list2) {
        Optional<Person> result = list2.stream()
                .filter(person -> person.getFirstName().length() < 15).min((o1, o2) -> -o1.getAge().compareTo(o2.getAge()));
       return result;
    }

}
