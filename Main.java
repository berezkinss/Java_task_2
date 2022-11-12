package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        int temp = 10;
        int storm = 17;

        System.out.println("Сколько на улице градусов тепла?");
        int x = myscan.nextInt();
        System.out.println("Какая на улице скорость ветра?");
        int y = myscan.nextInt();
        System.out.println("Есть ли на улице дождь?");
        String z = myscan.next();
        boolean bool = true;

        if(bool){

            if (y > storm){
                System.out.println("На улице слишком сильный ветер для прогулки!");
                bool = false;
            }


            if (x <= temp) {
                System.out.println("На улице слишком холодно для прогулки!");
                bool = false;
            }



            if (z.equals("Да")) {
                System.out.println("На улице идет дождь,идти гулять не стоит!");
                bool = false;
            }

        }
        if(bool){
            System.out.println("На улице отличная погода,пойдем гулять!");
        }

    }
}
