package org.example;

public class Main {
    public static void main(String[] args) {
        Fruit.yumm();
        Fruit myFruit = new Fruit();
        myFruit.name = "Apple";
        myFruit.weight = "1kg";
        System.out.println(myFruit.name + "  " + myFruit.weight);
    }

}
}