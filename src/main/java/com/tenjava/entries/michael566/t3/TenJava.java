package com.tenjava.entries.michael566.t3;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;

public class TenJava extends JavaPlugin {



    public void onEnable() {

    }



    public void onDisable() {

    }


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("random")) {
            Random rand = new Random();
            int randomnumber;
            for (int counter = 1; counter<=1; counter++) {
                randomnumber = 1+rand.nextInt(5);

                if (randomnumber == 1) {
                  p.setFireTicks(50);

                }
                else if (randomnumber == 2) {
                  p.sendMessage(ChatColor.GOLD + "You were saved this time :P");
                }
                else if (randomnumber == 3) {
                  p.kickPlayer("You were unlucky that time");
                }

                else if (randomnumber == 4) {
                   p.setFoodLevel(2);
                    p.sendMessage(ChatColor.RED + "You suddenly lost lots of food");
                }

                else if (randomnumber == 5) {
                   p.getWorld().spawnEntity(p.getLocation(), EntityType.CHICKEN);

                }






            }
        }



        return false;
    }
}
