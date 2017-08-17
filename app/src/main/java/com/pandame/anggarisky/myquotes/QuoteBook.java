package com.pandame.anggarisky.myquotes;

import java.util.Random;

/**
 * Created by anggarisky on 8/17/17.
 */

public class QuoteBook {
    private String[] facts = {
            "Dream big. do bigger.",
            "Be a good people.",
            "Array 2",
            "Array 3",
            "Array 4",
            "Array 5",
            "Learning Everyday with Angga Risky",
            "Array 7",
            "Array 8",
            "Array 9",
            "Array 10",
            "Array 11"
    };

    String getQuote() {
        Random randomText = new Random();
        int randomNumber = randomText.nextInt(facts.length);
        return facts[randomNumber];
    }

}
