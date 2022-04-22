package br.nextdev.tag.TagManager;

import com.nametagedit.plugin.NametagEdit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TagCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)){
            sender.sendMessage("§cComando permitido somente para jogadores.");
        }else{
            Player p = (Player) sender;
            if(args.length == 0){
                sender.sendMessage("§c * Uso incorreto, utilize: /tag [grupo]");
                return true;
            } else if (args[0].equalsIgnoreCase("admin")){
                if(p.hasPermission("tag.admin")){
                    if(p.getDisplayName().contains("ADMIN")){
                        p.sendMessage("§cVocê já está utilizando esse grupo.");
                    }else{
                        p.sendMessage("§aSua tag foi alterada para: §c§lADMIN");
                        p.setDisplayName("§c§lADMIN §c" + p.getName());
                        NametagEdit.getApi().setNametag(p, "§c§lADMIN §c", "");
                    }
                }
            }else if (args[0].equalsIgnoreCase("mod+")){
                if(p.hasPermission("tag.modplus")){
                    if(p.getDisplayName().contains("MOD+")){
                        p.sendMessage("§cVocê já está utilizando esse grupo.");
                    }else{
                        p.sendMessage("§aSua tag foi alterada para: §5§lMOD+");
                        p.setDisplayName("§5§lMOD+ §5" + p.getName());
                        NametagEdit.getApi().setNametag(p, "§5§lMOD+ §5", "");
                    }
                }
            }else if (args[0].equalsIgnoreCase("mod")){
                if(p.hasPermission("tag.mod")){
                    if(p.getDisplayName().contains("MOD")){
                        p.sendMessage("§cVocê já está utilizando esse grupo.");
                    }else{
                        p.sendMessage("§aSua tag foi alterada para: §5§lMOD");
                        p.setDisplayName("§5§lMOD §5" + p.getName());
                        NametagEdit.getApi().setNametag(p, "§5§lMOD §5", "");
                    }
                }
            }else if (args[0].equalsIgnoreCase("trial")){
                if(p.hasPermission("tag.trial")){
                    if(p.getDisplayName().contains("TRIAL")){
                        p.sendMessage("§cVocê já está utilizando esse grupo.");
                    }else{
                        p.sendMessage("§aSua tag foi alterada para: §5§lTRIAL");
                        p.setDisplayName("§5§lTRIAL §5" + p.getName());
                        NametagEdit.getApi().setNametag(p, "§5§lTRIAL §5", "");
                    }
                }
            }else if (args[0].equalsIgnoreCase("ytplus")){
                if(p.hasPermission("tag.ytplus")){
                    if(p.getDisplayName().contains("YT+")){
                        p.sendMessage("§cVocê já está utilizando esse grupo.");
                    }else{
                        p.sendMessage("§aSua tag foi alterada para: §3§lYT+");
                        p.setDisplayName("§3§lYT+ §3" + p.getName());
                        NametagEdit.getApi().setNametag(p, "§3§lYT+ §3", "");
                    }
                }
            }else if (args[0].equalsIgnoreCase("builder")){
                if(p.hasPermission("tag.builder")){
                    if(p.getDisplayName().contains("BUILDER")){
                        p.sendMessage("§cVocê já está utilizando esse grupo.");
                    }else{
                        p.sendMessage("§aSua tag foi alterada para: §2§lBUILDER");
                        p.setDisplayName("§2§lBUILDER §2" + p.getName());
                        NametagEdit.getApi().setNametag(p, "§2§lBUILDER §2", "");
                    }
                }
            }else if (args[0].equalsIgnoreCase("destaque")){
                if(p.hasPermission("tag.destaque")){
                    if(p.getDisplayName().contains("DESTAQUE")){
                        p.sendMessage("§cVocê já está utilizando esse grupo.");
                    }else{
                        p.sendMessage("§aSua tag foi alterada para: §e§lDESTAQUE");
                        p.setDisplayName("§e§lDESTAQUE §e" + p.getName());
                        NametagEdit.getApi().setNametag(p, "§e§lDESTAQUE §e", "");
                    }
                }
            }else if (args[0].equalsIgnoreCase("yt")){
                if(p.hasPermission("tag.yt")){
                    if(p.getDisplayName().contains("YT")){
                        p.sendMessage("§cVocê já está utilizando esse grupo.");
                    }else{
                        p.sendMessage("§aSua tag foi alterada para: §b§lYT");
                        p.setDisplayName("§b§lYT §b" + p.getName());
                        NametagEdit.getApi().setNametag(p, "§b§lYT §b", "");
                    }
                }
            }else if (args[0].equalsIgnoreCase("streamer")){
                if(p.hasPermission("tag.streamer")){
                    if(p.getDisplayName().contains("STREAMER")){
                        p.sendMessage("§cVocê já está utilizando esse grupo.");
                    }else{
                        p.sendMessage("§aSua tag foi alterada para: §b§lSTREAMER");
                        p.setDisplayName("§b§lSTREAMER §b" + p.getName());
                        NametagEdit.getApi().setNametag(p, "§b§lSTREAMER §b", "");
                    }
                }
            }else if (args[0].equalsIgnoreCase("shorts")){
                if(p.hasPermission("tag.shorts")){
                    if(p.getDisplayName().contains("SHORTS")){
                        p.sendMessage("§cVocê já está utilizando esse grupo.");
                    }else{
                        p.sendMessage("§aSua tag foi alterada para: §b§lSHORTS");
                        p.setDisplayName("§b§lSHORTS §b" + p.getName());
                        NametagEdit.getApi().setNametag(p, "§b§lSHORTS §b", "");
                    }
                }
            }else if (args[0].equalsIgnoreCase("beta")){
                if(p.hasPermission("tag.beta")){
                    if(p.getDisplayName().contains("BETA")){
                        p.sendMessage("§cVocê já está utilizando esse grupo.");
                    }else{
                        p.sendMessage("§aSua tag foi alterada para: §1§lBETA");
                        p.setDisplayName("§1§lBETA §1" + p.getName());
                        NametagEdit.getApi().setNametag(p, "§1§lBETA §1", "");
                    }
                }
            }else if (args[0].equalsIgnoreCase("pro")){
                if(p.hasPermission("tag.pro")){
                    if(p.getDisplayName().contains("PRO")){
                        p.sendMessage("§cVocê já está utilizando esse grupo.");
                    }else{
                        p.sendMessage("§aSua tag foi alterada para: §6§lPRO");
                        p.setDisplayName("§6§lPRO §6" + p.getName());
                        NametagEdit.getApi().setNametag(p, "§6§lPRO §6", "");
                    }
                }
            }else if (args[0].equalsIgnoreCase("vip")){
                if(p.hasPermission("tag.vip")){
                    if(p.getDisplayName().contains("VIP")){
                        p.sendMessage("§cVocê já está utilizando esse grupo.");
                    }else{
                        p.sendMessage("§aSua tag foi alterada para: §a§lVIP");
                        p.setDisplayName("§a§lVIP §a" + p.getName());
                        NametagEdit.getApi().setNametag(p, "§a§lVIP §a", "");
                    }
                }
            }else if (args[0].equalsIgnoreCase("membro")){
                if(p.hasPermission("tag.membro")){
                    if(p.getDisplayName().contains("MEMBRO")){
                        p.sendMessage("§cVocê já está utilizando esse grupo.");
                    }else{
                        p.sendMessage("§aSua tag foi alterada para: §7Membro");
                        p.setDisplayName("§7 " + p.getName());
                        NametagEdit.getApi().setNametag(p, "§7 ", "");
                    }
                }
            }else{
                p.sendMessage("§cEsta tag não existe, utilize /tags para visualizar todas as tags.");
            }
        }
        return true;
    }
}
