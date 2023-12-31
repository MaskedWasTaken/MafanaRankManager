package me.tahacheji.mafana.rank;

import me.tahacheji.mafana.rankManager.Rank;
import me.tahacheji.mafana.rankManager.RankPermission;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import java.awt.*;


public class Builder extends Rank {
    public Builder() {
        super("BUILDER",
                ChatColor.DARK_GRAY + "[" + ChatColor.of(new Color(245, 245, 220)) + "Builder" + ChatColor.DARK_GRAY + "]"
                ,8, new RankPermission("WorldEdit", "worldedit.*"), new RankPermission("MafanaRankManager", "mafana.builder"), new RankPermission("MafanaRankManager", "mafana.moderator"), new RankPermission("MafanaRankManager", "mafana.staff"), new RankPermission("MafanaRankManager", "mafana.friend"), new RankPermission("MafanaRankManager", "mafana.diamond") , new RankPermission("MafanaRankManager", "mafana.gold"), new RankPermission("MafanaRankManager", "mafana.silver"),
                new RankPermission("MafanaRankManager", "mafana.copper"));
    }

    @Override
    public boolean playerBreakBlockEvent(Player player, BlockBreakEvent event) {
        event.setCancelled(false);
        return true;
    }

    @Override
    public boolean playerPlaceBlockEvent(Player player, BlockPlaceEvent event) {
        event.setCancelled(false);
        return true;
    }
}
