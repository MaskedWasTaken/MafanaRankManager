package me.tahacheji.mafana.rank;

import me.tahacheji.mafana.rankManager.Rank;
import me.tahacheji.mafana.rankManager.RankPermission;
import net.md_5.bungee.api.ChatColor;

import java.awt.*;


public class Owner extends Rank {
    public Owner() {
        super("OWNER",
                ChatColor.DARK_GRAY + "[" + ChatColor.of(new Color(255, 245, 238)) + "Owner" + ChatColor.DARK_GRAY + "]"
                ,13, new RankPermission("MafanaRankManager", "mafana.admin"), new RankPermission("MafanaRankManager", "mafana.general.manager"), new RankPermission("MafanaRankManager", "mafana.game.manager"), new RankPermission("MafanaRankManager", "mafana.game.developer"), new RankPermission("MafanaRankManager", "mafana.game.designer"), new RankPermission("WorldEdit", "worldedit.*"), new RankPermission("MafanaRankManager", "mafana.builder"), new RankPermission("MafanaRankManager", "mafana.moderator"), new RankPermission("MafanaRankManager", "mafana.staff"), new RankPermission("MafanaRankManager", "mafana.friend"), new RankPermission("MafanaRankManager", "mafana.diamond") , new RankPermission("MafanaRankManager", "mafana.gold"), new RankPermission("MafanaRankManager", "mafana.silver"),
                new RankPermission("MafanaRankManager", "mafana.copper"), new RankPermission("MafanaRankManager", "mafana.owner"));
    }
}
