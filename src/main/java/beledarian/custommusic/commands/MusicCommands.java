package beledarian.custommusic.commands;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class MusicCommands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        int volume = 1;
        int pitch = 1;
        int valid = 1;
        int pcheck = 1;
        try {
            volume = Integer.parseInt(args[1]);
        } catch (Exception ignored) {
        }
        try {
            pitch = Integer.parseInt(args[2]);
        } catch (Exception ignored) {
        }
        if (pitch >= 3) {
            sender.sendMessage("Max pitch is 2");
            valid--;
        }

        if (valid == 1) {
            Player player = (Player) sender;
            if (args.length == 4){valid--;}
            if (valid == 0){player = Bukkit.getPlayer(args[3]);}


            if (Objects.equals(args[0], "help")) {
                player.sendMessage("§6/music <song/sound/stop> + \noptional: <volume> <speed(1/2)> <player>" );
            }

            if (Objects.equals(args[0], "stop")) {
                player.stopAllSounds();
            }
            player.stopAllSounds();
            if (Objects.equals(args[0], "credits")) {
            }
            else if (Objects.equals(args[0], "creative")) {
                player.playSound(player.getLocation(), Sound.MUSIC_CREATIVE, volume, pitch);
            }
            else if (Objects.equals(args[0], "disc11")) {
                player.playSound(player.getLocation(), Sound.MUSIC_DISC_11, volume, pitch);
            }
            else if (Objects.equals(args[0], "disc13")) {
                player.playSound(player.getLocation(), Sound.MUSIC_DISC_13, volume, pitch);
            }
            else if (Objects.equals(args[0], "discCat")) {
                player.playSound(player.getLocation(), Sound.MUSIC_DISC_CAT, volume, pitch);
            }
            else if (Objects.equals(args[0], "discBlocks")) {
                player.playSound(player.getLocation(), Sound.MUSIC_DISC_BLOCKS, volume, pitch);
            }
            else if (Objects.equals(args[0], "discMall")) {
                player.playSound(player.getLocation(), Sound.MUSIC_DISC_MALL, volume, pitch);
            }
            else if (Objects.equals(args[0], "discChirp")) {
                player.playSound(player.getLocation(), Sound.MUSIC_DISC_CHIRP, volume, pitch);
            }
            else if (Objects.equals(args[0], "discFar")) {
                player.playSound(player.getLocation(), Sound.MUSIC_DISC_FAR, volume, pitch);
            }
            else if (Objects.equals(args[0], "discMellohi")) {
                player.playSound(player.getLocation(), Sound.MUSIC_DISC_MELLOHI, volume, pitch);
            }
            else if (Objects.equals(args[0], "discOtherside")) {
                player.playSound(player.getLocation(), Sound.MUSIC_DISC_OTHERSIDE, volume, pitch);
            }
            else if (Objects.equals(args[0], "discPigstep")) {
                player.playSound(player.getLocation(), Sound.MUSIC_DISC_PIGSTEP, volume, pitch);
            }
            else if (Objects.equals(args[0], "discStal")) {
                player.playSound(player.getLocation(), Sound.MUSIC_DISC_STAL, volume, pitch);
            }
            else if (Objects.equals(args[0], "discStrad")) {
                player.playSound(player.getLocation(), Sound.MUSIC_DISC_STRAD, volume, pitch);
            }
            else if (Objects.equals(args[0], "discWait")) {
                player.playSound(player.getLocation(), Sound.MUSIC_DISC_WAIT, volume, pitch);
            }
            else if (Objects.equals(args[0], "discWard")) {
                player.playSound(player.getLocation(), Sound.MUSIC_DISC_WAIT, volume, pitch);
            }
            else if (Objects.equals(args[0], "dragon")) {
                player.playSound(player.getLocation(), Sound.MUSIC_DRAGON, volume, pitch);
            }
            else if (Objects.equals(args[0], "end")) {
                player.playSound(player.getLocation(), Sound.MUSIC_END, volume, pitch);
            }
            else if (Objects.equals(args[0], "game")) {
                player.playSound(player.getLocation(), Sound.MUSIC_GAME, volume, pitch);
            }
            else if (Objects.equals(args[0], "menu")) {
                player.playSound(player.getLocation(), Sound.MUSIC_MENU, volume, pitch);
            }
            else if (Objects.equals(args[0], "NetherBasaltDeltas")) {
                player.playSound(player.getLocation(), Sound.MUSIC_NETHER_BASALT_DELTAS, volume, pitch);
            }
            else if (Objects.equals(args[0], "NetherCrimsonForest")) {
                player.playSound(player.getLocation(), Sound.MUSIC_NETHER_CRIMSON_FOREST, volume, pitch);
            }
            else if (Objects.equals(args[0], "NetherSoulSandValley")) {
                player.playSound(player.getLocation(), Sound.MUSIC_NETHER_SOUL_SAND_VALLEY, volume, pitch);
            }
            else if (Objects.equals(args[0], "NetherWastes")) {
                player.playSound(player.getLocation(), Sound.MUSIC_NETHER_NETHER_WASTES, volume, pitch);
            }
            else if (Objects.equals(args[0], "WarpedForest")) {
                player.playSound(player.getLocation(), Sound.MUSIC_NETHER_WARPED_FOREST, volume, pitch);
            }
            else if (Objects.equals(args[0], "DripstoneCaves")) {
                player.playSound(player.getLocation(), Sound.MUSIC_OVERWORLD_DRIPSTONE_CAVES, volume, pitch);
            }
            else if (Objects.equals(args[0], "FrozenPeaks")) {
                player.playSound(player.getLocation(), Sound.MUSIC_OVERWORLD_FROZEN_PEAKS, volume, pitch);
            }
            else if (Objects.equals(args[0], "Grove")) {
                player.playSound(player.getLocation(), Sound.MUSIC_OVERWORLD_GROVE, volume, pitch);
            }
            else if (Objects.equals(args[0], "JaggedPeaks")) {
                player.playSound(player.getLocation(), Sound.MUSIC_OVERWORLD_JAGGED_PEAKS, volume, pitch);
            }
            else if (Objects.equals(args[0], "Meadow")) {
                player.playSound(player.getLocation(), Sound.MUSIC_OVERWORLD_MEADOW, volume, pitch);
            }
            else if (Objects.equals(args[0], "LushCaves")) {
                player.playSound(player.getLocation(), Sound.MUSIC_OVERWORLD_LUSH_CAVES, volume, pitch);
            }
            else if (Objects.equals(args[0], "SnowySlopes")) {
                player.playSound(player.getLocation(), Sound.MUSIC_OVERWORLD_SNOWY_SLOPES, volume, pitch);
            }
            else if (Objects.equals(args[0], "StonyPeaks")) {
                player.playSound(player.getLocation(), Sound.MUSIC_OVERWORLD_STONY_PEAKS, volume, pitch);
            }
            else if (Objects.equals(args[0], "UnderWater")) {
                player.playSound(player.getLocation(), Sound.MUSIC_UNDER_WATER, volume, pitch);
            }
            
        }


        return false;
    }
}
