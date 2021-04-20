package com.company.fruits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxWithFruits<T extends Fruit> {
    private List<T> fruitBox;


    public BoxWithFruits() {
        this.fruitBox = new ArrayList<>();
    }

    public BoxWithFruits(T... fruits) {
        this.fruitBox = new ArrayList(Arrays.asList(fruits));
    }

    /**
     * высчитывает массу бчик
     * @return
     */
    public float getWeightBox(){
        float weight = 0.0f;
        for (T o: fruitBox) {
            weight += o.getWeight();
        }
        return weight;
    }

    /**
     * Метод сравнивает Весса коробок
     * @param anotherBox ввод коробки с которой будет сравниватся
     * @return
     */
    public boolean compare(BoxWithFruits<?> anotherBox){
        return Math.abs(getWeightBox()-anotherBox.getWeightBox()) < 0.0001;
    }


    /**
     * Пересыпить в другую коробку
     * <? super T> позволяет пересыпать в лист Fruit и его подкалсс
     * @param another коробка в которую переспим, не должен быть this
     */
    public void pourIntoAnotherBox(BoxWithFruits<? super T> another){

        if (another == this){
            return;
        }
        another.fruitBox.addAll(this.fruitBox);
        this.fruitBox.clear();
    }

    /**
     * Добавить фрукт
     * @param fruit
     */
    public void addFruit(T fruit){
        fruitBox.add(fruit);
    }








}
