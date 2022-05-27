package com.seely.thebot;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Seely {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();
        DateTimeFormatter formDate = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        DateTimeFormatter formTime = DateTimeFormatter.ofPattern("HH:mm:ss");


//        System.out.println(time.format(formTime));


        // Sastapos ar pāris problēmām, kurām, uz doto brīdi, neatradu pareizu risinājumu.
        // 1. Neizpratu kā izmantot containsAll, tāpēc nācās atkārtot contains pie sveiciena.
        // 2. Katru reizi palaižot programmu un ievadot inputu, tiek saņemta atbilde un programma apstājas.
        // 3. Izmantojot tikai "if" statement, "else if" vietā, var iegūt vairākas atbildes vienā inputā,
        // bet tādā veidā, tiek arī izsaukts "else"
        System.out.println("I am listening: ");

        while (true) {
        String input = sc.nextLine().toLowerCase();

            if (input.contains("hi") || input.contains("hey") || input.contains("hello")) {
                System.out.println("Hello! (:");
            }
            if (input.contains("name")) {
                System.out.println("My name is Seely and yours?");
                String name = sc.nextLine();
                System.out.println("It's nice to meet you " + name);
            }
            if (input.contains("time")) {
                System.out.println("Currently its " + time.format(formTime));
            }
            if (input.contains("date")) {
                System.out.println("Today is " + date.format(formDate));
            }
//            else {
//                System.out.println("I apologize, but I do not understand.");
//            }

        }

        // Jautājums - Vai var implementēt else, bez tā iejaucoties "if", kad informācija ir teksts

    }
}
