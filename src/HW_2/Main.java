package HW_2;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        long startTime, finishTime, methodExecutionTime;
        int capacity = 1000000;
        MyArrayList<Integer> arr = new MyArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            arr.add(random.nextInt(100));
        }
        MyArrayList<Integer> arrNew = new MyArrayList<>(capacity);
        for (int i = 0; i < capacity+20; i++) {
            arrNew.newAdd(random.nextInt(10));
        }

        startTime = System.currentTimeMillis();
        arr.bubbleSort();
        finishTime = System.currentTimeMillis();
        methodExecutionTime = finishTime - startTime;
        System.out.println("Bubble sorted execution time is " + methodExecutionTime + " seconds");
        startTime = System.currentTimeMillis();
        arr.insertionSort();
        finishTime = System.currentTimeMillis();
        methodExecutionTime = finishTime - startTime;
        System.out.println("Insertion sorted execution time is " + methodExecutionTime + " seconds");
        startTime = System.currentTimeMillis();
        arr.selectionSort();
        finishTime = System.currentTimeMillis();
        methodExecutionTime = finishTime - startTime;
        System.out.println("Selector sorted execution time is " + methodExecutionTime + " seconds");

        System.out.println("Task 4* " + arrNew);
        }
    }

