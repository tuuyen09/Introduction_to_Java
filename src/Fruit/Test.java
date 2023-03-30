package Fruit;

public class Test {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits){
           if(fruit instanceof Apple apple){
               System.out.println(apple.howToEat());
           }
        }
    }


}
