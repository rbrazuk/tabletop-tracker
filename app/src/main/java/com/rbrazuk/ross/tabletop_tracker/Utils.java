package com.rbrazuk.ross.tabletop_tracker;

import com.rbrazuk.ross.tabletop_tracker.Models.Game;
import com.rbrazuk.ross.tabletop_tracker.Models.Play;

import org.joda.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ross on 2/23/2017.
 */

public class Utils {

    public static List<Play> getDummyPlaysList() {
        List<Play> playsList = new ArrayList<>();
        playsList.add(new Play(new Game("Pandemic", null), new LocalDate(2017, 2, 24), null));
        playsList.add(new Play(new Game("Elder Sign", null), new LocalDate(2017, 2, 19), null));
        playsList.add(new Play(new Game("Tokaido", null), new LocalDate(2017, 2, 9), null));
        playsList.add(new Play(new Game("Hanabi", null), new LocalDate(2017, 1, 27), null));
        playsList.add(new Play(new Game("Tiny Epic Galaxies", null), new LocalDate(2017, 1, 12), null));

        return playsList;
    }
}
