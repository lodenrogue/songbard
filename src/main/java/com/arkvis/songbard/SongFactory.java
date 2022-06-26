package com.arkvis.songbard;

public class SongFactory {

    private SongFactory() {
    }

    public static Song createDefaultSong() {
        return new Song(new CrydeeGrammarian());
    }
}
