package com.arkvis.songbard;

import eu.crydee.syllablecounter.SyllableCounter;

public class CrydeeGrammarian implements Grammarian {

    CrydeeGrammarian() {

    }

    @Override
    public int count(String line) {
        return new SyllableCounter().count(line);
    }
}
