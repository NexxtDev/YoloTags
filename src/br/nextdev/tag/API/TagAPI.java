package br.nextdev.tag.API;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class TagAPI implements Listener {
    public static int count;

    public static String hasPlayerTag(Player p) {
        if (p.hasPermission("*")) {
            return "§c§lADMIN §c";
        } else if (p.hasPermission("tag.modplus")) {
            return "§5§lMOD+ §5";
        } else if (p.hasPermission("tag.mod")) {
            return "§5§lMOD §5";
        } else if (p.hasPermission("tag.trial")) {
            return "§5§lTRIAL §5";
        } else if (p.hasPermission("tag.ytplus")) {
            return "§3§lYT+ §3";
        } else if (p.hasPermission("tag.builder")) {
            return "§2§lBUILDER §2";
        } else if (p.hasPermission("tag.destaque")) {
            return "§e§lDESTAQUE §e";
        } else if (p.hasPermission("tag.yt")) {
            return "§b§lYT §b";
        } else if (p.hasPermission("tag.streamer")) {
            return "§b§lSTREAMER §b";
        } else if (p.hasPermission("tag.shorts")) {
            return "§b§lSHORTS §b";
        } else if (p.hasPermission("tag.beta")) {
            return "§1§lBETA §1";
        } else if (p.hasPermission("tag.pro")) {
            return "§6§lPRO §6";
        } else if (p.hasPermission("tag.vip")) {
            return "§a§lVIP §a";
        } else {
            return (p.hasPermission("tag.membro")) ? "§7" : "§7 ";
        }
    }

    public static String hasPlayerGroup(Player p) {
        if (p.hasPermission("*")) {
            return "§c§lADMIN §c";
        } else if (p.hasPermission("tag.modplus")) {
            return "§5§lMOD+ §5";
        } else if (p.hasPermission("tag.mod")) {
            return "§5§lMOD §5";
        } else if (p.hasPermission("tag.trial")) {
            return "§5§lTRIAL §5";
        } else if (p.hasPermission("tag.ytplus")) {
            return "§3§lYT+ §3";
        } else if (p.hasPermission("tag.builder")) {
            return "§2§lBUILDER §2";
        } else if (p.hasPermission("tag.destaque")) {
            return "§e§lDESTAQUE §e";
        } else if (p.hasPermission("tag.yt")) {
            return "§b§lYT §b";
        } else if (p.hasPermission("tag.streamer")) {
            return "§b§lSTREAMER §b";
        } else if (p.hasPermission("tag.shorts")) {
            return "§b§lSHORTS §b";
        } else if (p.hasPermission("tag.beta")) {
            return "§1§lBETA §1";
        } else if (p.hasPermission("tag.pro")) {
            return "§6§lPRO §6";
        } else if (p.hasPermission("tag.vip")) {
            return "§a§lVIP §a";
        } else {
            return (p.hasPermission("tag.membro")) ? "§7" : "§7";
        }
    }

    public static enum tags{
        ADMIN,
        MODPLUS,
        MOD,
        TRIAL,
        YTPLUS,
        BUILDER,
        DESTAQUE,
        YT,
        STREAMER,
        SHORTS,
        BETA,
        PRO,
        VIP,
        MEMBRO;
    }
}
