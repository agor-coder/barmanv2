/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.gorzki.barmanv2;

import java.util.ArrayList;
import java.util.InputMismatchException;
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
        boolean endReadNumber = false;
        boolean endReadIng = false;
        int numberOfIngr = 0;

        while (!endReadNumber) {
            try {
                System.out.println("podaj liczbę składników:");
                numberOfIngr = sc.nextInt();
                sc.nextLine();
                endReadNumber = true;
            } catch (InputMismatchException e) {
                System.out.println("źle - jeszcze raz");
                sc.nextLine();
            }
        }

        while (ing.size() < numberOfIngr) {
            try {
                System.out.printf("nazwa składnika %d:\n", ing.size() + 1);
                String igrName = sc.nextLine();
                System.out.println("ilość składnika:");
                int amount = sc.nextInt();
                sc.nextLine();

                ing.add(new Ingredient(igrName, amount));

            } catch (InputMismatchException e) {
                System.out.println("źle - jeszcze raz");
                sc.nextLine();
            }

        }

    }

    public static void printDrink(Drink drink) {
        if (drink.getIngredients().isEmpty()) {
            System.out.println("nie ma drinka");
        } else {
            System.out.printf("Drink składa się z %d składników: \n", drink.getIngredients().size());
        }
        for (Ingredient ingr : drink.getIngredients()) {
            System.out.println(ingr);
        }
    }
}
