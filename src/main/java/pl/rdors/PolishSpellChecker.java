package pl.rdors;

import org.apache.log4j.Logger;

/**
 * Created by rdors on 2017-06-03.
 */
public class PolishSpellChecker implements SpellChecker {

    private final static Logger LOGGER = Logger.getLogger(PolishSpellChecker.class);

    @Override
    public void send(String text) {
        LOGGER.info(String.format("Polish: %s", text));
    }

}
