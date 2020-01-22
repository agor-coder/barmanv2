/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.gorzki.barmanv2;

import java.util.List;

/**
 *
 * @author A
 */
public class Drink {
    private List<Ingredient>ingredients;

    public Drink(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }
    
    
}
