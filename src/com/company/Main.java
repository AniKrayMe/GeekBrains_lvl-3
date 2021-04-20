package com.company;

import com.company.fruits.Apple;
import com.company.fruits.BoxWithFruits;
import com.company.fruits.Orange;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5,6};
       swap(array,0,3);
       System.out.println(arrayToList(array)+"\n");


        BoxWithFruits boxOfOrange = new BoxWithFruits();
        BoxWithFruits boxOfApple = new BoxWithFruits();

        for (int i = 0; i < 15; i++) {
            boxOfOrange.addFruit(new Orange());
        }

        for (int i = 0; i < 10; i++) {
            boxOfApple.addFruit(new Apple());
        }
        BoxWithFruits boxWithFruits = new BoxWithFruits();

        System.out.println(boxOfApple.getWeightBox());
        System.out.println(boxOfOrange.getWeightBox());
        System.out.println(boxOfApple.compare(boxOfOrange));
        boxOfApple.pourIntoAnotherBox(boxWithFruits);
        System.out.println(boxOfApple.getWeightBox());
        System.out.println(boxWithFruits.getWeightBox());
    }

    /**
     * Задание 1
     * меняет конкретные элементы масива местами по индексу
     * @param array масив который будет редактироватся
     * @param index1,index2 меняются местами
     * @print Печатет в консоль
     */
    public static <T> void swap(T[] array, int index1, int index2) {
        T copyIndex1 =array[index1] ;
        array[index1] = array[index2];
        array[index2] = copyIndex1;
        for (Object o : array) {
            System.out.print(" " + o);
        }
    }


    /**
     * Задание 2
     * Метоб берёт обычный масив и делает из него ArrayList
     * @param arr обычный массив
     * @param <T>
     * @return
     */
    public static <T> ArrayList<T> arrayToList(T[] arr){
        return new ArrayList<>(Arrays.asList(arr));
    }




}
