package com.rbrazuk.ross.tabletop_tracker.Services;

import com.rbrazuk.ross.tabletop_tracker.Models.Game;
import com.rbrazuk.ross.tabletop_tracker.Models.Play;
import com.rbrazuk.ross.tabletop_tracker.Models.Player;

import org.joda.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

public class SqlService {

    public static void savePlay(List<Player> players, Game game, LocalDate date) {

        List<Player> dbPlayers = Player.listAll(Player.class);
        long[] ids = new long[players.size()];
        System.out.println(dbPlayers);

        for (Player player : players) {

            if (Player.listAll(Player.class).size() != 0) {
                for (Player existingPlayer : Player.listAll(Player.class)) {
                    if (player.getName().equals(existingPlayer.getName())) {
                        break;
                    } else {
                        player.save();
                    }
                }
            } else {
                player.save();
            }
        }

        for (Game existingGame : Game.listAll(Game.class)) {
            if (game.getTitle().equals(existingGame.getTitle())) {
                break;
            } else {
                game.save();
            }
        }

        Play play = new Play(game, date, players);

        play.save();

        for (int i = 0; i < players.size(); i++) {
            ids[i] = players.get(i).getId();
        }

        System.out.println(ids);

        System.out.println(play.toString());

        for (int i = 0; i < ids.length; i++) {
            Player player = Player.findById(Player.class, ids[i]);
            player.addPlay(play);
            player.save();
        }


        System.out.println(Player.listAll(Player.class));

        System.out.println(players);
    }

    public static List<Play> getAllPlays() {
        return Play.listAll(Play.class);
    }
}
