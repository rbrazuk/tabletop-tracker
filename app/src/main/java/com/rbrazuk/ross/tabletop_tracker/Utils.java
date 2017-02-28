package com.rbrazuk.ross.tabletop_tracker;

import com.rbrazuk.ross.tabletop_tracker.Models.Game;
import com.rbrazuk.ross.tabletop_tracker.Models.Play;
import com.rbrazuk.ross.tabletop_tracker.Models.Player;

import org.joda.time.LocalDate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Utils {

    public static List<Play> getDummyPlaysList() {
        List<Play> playsList = new ArrayList<>();
        playsList.add(new Play(new Game("Pandemic"),
                new LocalDate(2017, 2, 24),
                new ArrayList<>(Arrays.asList(
                        new Player[]{new Player("Ross"),
                                new Player("Erin"),
                                new Player("Tim"),
                                new Player("Christine")
                        }
                ))));

        playsList.add(new Play(new Game("Elder Sign"),
                new LocalDate(2017, 2, 19),
                new ArrayList<>(Arrays.asList(
                        new Player[]{new Player("Ross")
                        }
                ))));

        playsList.add(new Play(new Game("Tokaido"),
                new LocalDate(2017, 2, 12),
                new ArrayList<>(Arrays.asList(
                        new Player[]{
                                new Player("Ross"),
                                new Player("Steve"),
                                new Player("Ceena")
                        }
                ))));

        playsList.add(new Play(new Game("Hanabi"),
                new LocalDate(2017, 2, 3),
                new ArrayList<>(Arrays.asList(
                        new Player[]{
                                new Player("Ross"),
                                new Player("Erin")
                        }
                ))));

        playsList.add(new Play(new Game("Tiny Epic Galaxies"),
                new LocalDate(2017, 1, 24),
                new ArrayList<>(Arrays.asList(
                        new Player[]{
                                new Player("Ross"),
                                new Player("Tyler"),
                                new Player("John")
                        }
                ))));

        playsList.add(new Play(new Game("Pandemic"),
                new LocalDate(2017, 1, 16),
                new ArrayList<>(Arrays.asList(
                        new Player[]{
                                new Player("Ross"),
                                new Player("Erin"),
                                new Player("Tim"),
                                new Player("Christine")
                        }
                ))));

        return playsList;
    }

    public static Set<String> getGamesSet() {
        List<Play> plays = getDummyPlaysList();
        Set<String> gamesSet = new HashSet<>();

        for (Play play : plays) {
            gamesSet.add(play.getGame().getTitle());
        }

        return gamesSet;
    }
}
