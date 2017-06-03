package pl.rdors;

import com.google.inject.AbstractModule;

/**
 * Created by rdors on 2017-06-03.
 */
public class MyModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Emailer.class);
        bind(SpellChecker.class).to(PolishSpellChecker.class);
    }

}
