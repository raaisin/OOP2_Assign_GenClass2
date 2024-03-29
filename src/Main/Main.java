package Main;


import Arithmetic.Arithmetic;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //lol nvm

        Scanner scanner = new Scanner(System.in);

        System.out.println("What you wanna test 1 - Ari, 2 - Map: ");
        int type = scanner.nextInt();

        switch (type){
            case 1:
                Arithmetic arithmetic = new Arithmetic<>(10.123,10);
                System.out.println(arithmetic.add());

                break;

            case 2:

        }





    }
}