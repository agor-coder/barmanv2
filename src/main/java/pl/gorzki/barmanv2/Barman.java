/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.gorzki.barmanv2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author A
 */
public class Barman {

    public static Drink createDrink() {
        ArrayList<Ingredient> ing = new ArrayList<>();
        fillList(ing);
        return new Drink(ing);
    }

    private static void fillList(ArrayList<Ingredient> ing) {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj liczbę składników:");
        int numberOfIngr = sc.nextInt();
        sc.nextLine();

        while (ing.size() < numberOfIngr) {
            System.out.println("nazwa składnika:");
            String igrName = sc.nextLine();
            System.out.println("ilość składnika:");
            int amount = sc.nextInt();
            sc.nextLine();
            ing.add(new Ingredient(igrName, amount));
        }

    }

    public static void printDrink(Drink drink) {
        System.out.printf("Drink składa się z %d składników: \n", drink.getIngredients().size());
        for (Ingredient ingr : drink.getIngredients()) {
            System.out.println(ingr);

        }
    }
}
