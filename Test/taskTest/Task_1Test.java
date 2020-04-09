package taskTest;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class Task_1Test {
    private Task_1 task = new Task_1();
    /** 1.	Дан список целых чисел. Найти среднее всех нечётных чисел, делящихся на 5.*/
    @Test
    public void Task_1Test1() {
        List<Integer> list = Arrays.asList(7,9,5,1,2,2,2,2,15,25);
        double expected = 16.0;
        double actual = task.task_1(list);
        Assert.assertEquals(expected, actual, 0.01);
        System.out.println(actual);
    }
    /**2.Дан список строк. Найти количество уникальных строк длиной более 8 символов.*/
    @Test
    public void Task_2Test2() {
        List<String> lest1 = Arrays.asList("34d4545342", "123456789", "123456789", "dfg", "dg", "FdgdfgdfFF", "fgfgdgfdfgdfg", "adas");
        double expected = 4.0;
        double actual = task.task_2(lest1);
        Assert.assertEquals(expected, actual, 0.01);
        System.out.println(actual);
    }
    /**3.Дана Map<String, Integer>. Найти сумму всех значений, длина ключей которых меньше 7 символов.*/
    @Test
    public void Task_3Test3() {
        Map<String, Integer> map = new HashMap<>();
        map.put("fsf", 44);
        map.put("sfdfdf", 84);
        map.put("sf", 1);
        map.put("sdfsdfdsfds", 212);
        map.put("sdfsdfdsfsfsdf", 45);
        long expected = 129;
        long actual = (long) task.task_3(map);
        Assert.assertEquals(expected, actual);
        System.out.println(actual);
    }
    /** 4.Дан список целых чисел, вывести строку, представляющую собой конкатенацию строковых представлений этих чисел.
    Пример: список {5, 2, 4, 2, 1}
    Результирующая строка: "52421" */
    @Test
    public void Task_4Test4() {
        List<Integer> list = Arrays.asList(7,9,5,1,2,2,2,2,15,25);
        String expected = "795122221525";
        String actual = task.task_4(list);
        Assert.assertEquals(expected, actual);
        System.out.println(actual);
    }
    /**5.Дан класс Person с полями firstName, lastName, age.
    Вывести полное имя самого старшего человека, у которого длина этого имени не превышает 15 символов. */
    @Test
    public void Task_5Test5() {
        List<Person> list2 = new ArrayList<>();
        Person person1 = new Person("dfe", "efwfe", 12);
        Person person2 = new Person("123456789456", "йцу", 30);
        Person person3 = new Person("1324323423", "wefewf", 29);
        list2.add(person1);
        list2.add(person2);
        list2.add(person3);
        Optional<Person> expected = Optional.of(person2);
        Optional<Person> actual = task.task_5(list2);
        Assert.assertEquals(expected, actual);
        System.out.println(actual);
    }
}
