package org.own.springtest;

import java.util.logging.Logger;

public class Mininstrel {

    private final static Logger SONG = Logger.getLogger(Mininstrel.class.getName());

    public Mininstrel() { }

    public void compose(final String name, final String message) {
        SONG.info("Fa la la! Brave " + name + " did " + message + "!");
    }
}