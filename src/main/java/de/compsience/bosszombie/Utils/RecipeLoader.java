package de.compsience.bosszombie.Utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.material.MaterialData;

public class RecipeLoader {

    public void registerRecipes() {
        ShapedRecipe recipe = new ShapedRecipe(Items.azrocRose());
        recipe.shape("BBB", "FFF", "BBB");
        recipe.setIngredient('F', new MaterialData(Material.ROTTEN_FLESH, Items.summonItem().getData().getData()));
        Bukkit.addRecipe(recipe);
    }
}
