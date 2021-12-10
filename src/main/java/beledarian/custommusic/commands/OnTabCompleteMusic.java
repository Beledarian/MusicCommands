package beledarian.custommusic.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class OnTabCompleteMusic implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("music") && args.length == 1) {
            if (sender instanceof Player) {
                List<String> list = new ArrayList<>();
                list.add("stop");
                list.add("help");
                list.add("credits");
                list.add("creative");
                list.add("disc11");
                list.add("disc13");
                list.add("discCat");
                list.add("discBlocks");
                list.add("discMall");
                list.add("discChirp");
                list.add("discFar");
                list.add("discMellohi");
                list.add("discOtherside");
                list.add("discPigstep");
                list.add("discStal");
                list.add("discStrad");
                list.add("discWait");
                list.add("discWard");
                list.add("dragon");
                list.add("end");
                list.add("game");
                list.add("menu");
                list.add("NetherBasaltDeltas");
                list.add("NetherCrimsonForest");
                list.add("NetherSoulSandValley");
                list.add("NetherWastes");
                list.add("WarpedForest");
                list.add("DripstoneCaves");
                list.add("FrozenPeaks");
                list.add("Grove");
                list.add("JaggedPeaks");
                list.add("Meadow");
                list.add("LushCaves");
                list.add("SnowySlopes");
                list.add("StonyPeaks");
                list.add("UnderWater");

                return list;
            }
        }
        if (cmd.getName().equalsIgnoreCase("music") && args.length == 2) {
            if (sender instanceof Player) {
                List<String> list = new ArrayList<>();
                list.add("1");
                return list;
            }
        }
        if (cmd.getName().equalsIgnoreCase("music") && args.length == 3) {
            if (sender instanceof Player) {
                List<String> list = new ArrayList<>();
                list.add("1");
                return list;
            }
        }
        return null;
    }

}
