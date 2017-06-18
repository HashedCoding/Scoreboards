package me.hashed.scoreboards;

        import org.bukkit.Bukkit;
        import org.bukkit.ChatColor;
        import org.bukkit.entity.Player;
        import org.bukkit.scoreboard.DisplaySlot;
        import org.bukkit.scoreboard.Objective;
        import org.bukkit.scoreboard.Score;
        import org.bukkit.scoreboard.Scoreboard;


public class ScoreboardManager {

    Main plugin = new Main();

    public void setScoreboard(final Player player){
        Scoreboard board = Bukkit.getScoreboardManager().getNewScoreboard();
        Objective objective = board.registerNewObjective("scoreboard", "dummy");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        objective.setDisplayName(ChatColor.AQUA + "Pixel" + ChatColor.GOLD + "Network");

        Score spacer = objective.getScore(ChatColor.AQUA + "");
        spacer.setScore(11);

        Score nameTitle = objective.getScore(ChatColor.RED + "Naam:");
        nameTitle.setScore(10);

        Score spacer1 = objective.getScore(ChatColor.AQUA + "");
        spacer1.setScore(9);

        Score name = objective.getScore(ChatColor.DARK_AQUA + player.getName());
        name.setScore(8);

        Score spacer2 = objective.getScore(ChatColor.AQUA + "");
        spacer2.setScore(7);

        Score killsTitle = objective.getScore(ChatColor.DARK_AQUA + "Kills:");
        killsTitle.setScore(6);

        Score kills = objective.getScore(ChatColor.AQUA + plugin.getConfig().getString(player.getUniqueId().toString() + ".kills"));
        kills.setScore(5);

        Score spacer3 = objective.getScore(ChatColor.AQUA + "");
        spacer3.setScore(4);

        Score deathsTitle = objective.getScore(ChatColor.DARK_AQUA + "Deaths:");
        deathsTitle.setScore(3);

        Score deaths = objective.getScore(ChatColor.AQUA + plugin.getConfig().getString(player.getUniqueId().toString() + ".deaths"));
        deaths.setScore(2);

        Score spacer4 = objective.getScore(ChatColor.AQUA + "");
        spacer4.setScore(1);

        player.getScoreboard().clearSlot(DisplaySlot.SIDEBAR);
        player.setScoreboard(board);




    }
}