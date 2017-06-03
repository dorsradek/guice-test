package pl.rdors;

import com.google.inject.Inject;

/**
 * Created by rdors on 2017-06-03.
 */
public class Emailer {

    private SpellChecker spellChecker;

    @Inject
    public Emailer(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }


    public void send(String text) {
        spellChecker.send(text);
    }
}
