package pl.rdors;

import com.google.inject.Guice;

/**
 * Created by rdors on 2017-06-03.
 */
public class App {

    public static void main(String[] args) {
        start();
    }

    private static void start() {
        Guice.createInjector(new MyModule()).getInstance(Emailer.class).send("Hello!");
    }
}
