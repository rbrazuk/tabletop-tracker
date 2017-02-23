package com.rbrazuk.ross.tabletop_tracker;

import com.rbrazuk.ross.tabletop_tracker.Models.Game;
import com.rbrazuk.ross.tabletop_tracker.Models.Play;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ross on 2/23/2017.
 */

public class Utils {

    public static List<Play> getDummyPlaysList() {
        List<Play> playsList = new ArrayList<>();
        playsList.add(new Play(new Game("Pandemic", null), null, null));
        playsList.add(new Play(new Game("Elder Sign", null), null, null));
        playsList.add(new Play(new Game("Tokaido", null), null, null));
        playsList.add(new Play(new Game("Hanabi", null), null, null));
        playsList.add(new Play(new Game("Tiny Epic Galaxies", null), null, null));

        return playsList;
    }
}
