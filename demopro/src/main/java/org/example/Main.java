package org.example;

import java.text.NumberFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Example 1
        // Yummy
        // Apple  1kg
        Fruit.yumm();
        Fruit myFruit = new Fruit();
        myFruit.name = "Apple";
        myFruit.weight = "1kg";
        System.out.println(myFruit.name + "  " + myFruit.weight);

        // Example 2:
        // \t tab space
        // c:	Windows\...
        String message = "c:\tWindows\\...";
        System.out.println(message);


        // Example 3:
        // Without Arrays --> Ans: [I@c387f44
        // Ans: [1, 2, 3, 4, 5]
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        System.out.println(Arrays.toString(numbers));

        // Example 4: Skip Instantiation
        int[] numbers2 = {1, 3, 4};
        System.out.println(numbers2.length);
        System.out.println(Arrays.toString(numbers2));

        // Example 5
        // Playing with increments
        // y = x++ --> y = x && x = x + 1    Ans: x = 2 y = 1
        // y = ++x --> y = x + 1 && x = x + 1  Ans: x = 2 y = 2
        int x = 1;
        int y = x++;
        System.out.println(x);
        System.out.println(y);


       // Example 6 - Number format
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        currency.format(123.44);




    }

}
