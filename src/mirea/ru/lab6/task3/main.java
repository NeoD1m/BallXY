package mirea.ru.lab6.task3;

import mirea.ru.lab6.task1.student;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        student[] students = new student[5];
        students[0] = new student("Student number before is " + 3, 3);
        students[1] = new student("Student number before is " + 1, 1);
        students[2] = new student("Student number before is " + 7, 7);
        students[3] = new student("Student number before is " + 4, 4);
        students[4] = new student("Student number before is " + 5, 5);

        student[] students2 = new student[5];
        students2[0] = new student("Student number before is " + 6, 6);
        students2[1] = new student("Student number before is " + 17, 17);
        students2[2] = new student("Student number before is " + 2, 2);
        students2[3] = new student("Student number before is " + 11, 11);
        students2[4] = new student("Student number before is " + 9, 9);


        int[] array1 = {8, 0, -3, 5, 6, 9, 8, -4, 2, -99};

        for (int i = 0; i < 10; i++) {
            if (i <5)
            array1[i] = students[i].id; else
                array1[i] = students2[i-5].id;
        }
        int[] result = mergesort(array1);
        System.out.println(Arrays.toString(result));

    }
    public static int[] mergesort(int[] array1) {
        int[] buffer1 = Arrays.copyOf(array1, array1.length);
        int[] buffer2 = new int[array1.length];
        int[] result = mergesortInner(buffer1, buffer2, 0, array1.length);
        return result;
    }

    public static int[] mergesortInner(int[] buffer1, int[] buffer2,
                                       int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        // уже отсортирован.
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);

        // Слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}
