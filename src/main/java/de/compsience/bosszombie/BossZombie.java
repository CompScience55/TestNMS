package de.compsience.bosszombie;

import de.compsience.bosszombie.Commands.giveCommand;
import de.compsience.bosszombie.Listeners.*;
import de.compsience.bosszombie.Utils.RecipeLoader;
import org.bukkit.plugin.java.JavaPlugin;

public final class BossZombie extends JavaPlugin {

    private static BossZombie instance;

    @Override
    public void onEnable() {
        instance = this;
        this.getServer().getPluginManager().registerEvents(new SpawnEntity(), this);
        this.getServer().getPluginManager().registerEvents(new PlayerDrop(), this);
        this.getServer().getPluginManager().registerEvents(new EntityDeathEvent(), this);
        this.getServer().getPluginManager().registerEvents(new AzrocSpawnListener(), this);
        this.getServer().getPluginManager().registerEvents(new SkellySpawner(), this);
        this.getServer().getPluginManager().registerEvents(new SkeletonSpawner(), this);
        new RecipeLoader().registerRecipes();

        getCommand("give").setExecutor(new giveCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static BossZombie getInstance() {
        return instance;
    }
}
