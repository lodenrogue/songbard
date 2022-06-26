package com.arkvis.songbard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SyllableTest {

    @Test
    void should_returnZero_when_gettingNumberOfSyllablesInEmptyLyric() {
        Song song = SongFactory.createDefaultSong();
        song.addLyric("");

        Lyric lyric = song.getLyrics().get(0);
        assertEquals(0, lyric.getSyllableCount());
    }

    @Test
    void should_returnCorrectCount_when_gettingNumberOfSyllablesInSingleWordLyric() {
        Song song = SongFactory.createDefaultSong();
        song.addLyric("Happy");

        Lyric lyric = song.getLyrics().get(0);
        assertEquals(2, lyric.getSyllableCount());
    }

    @Test
    void should_returnCorrectCount_when_gettingNumberOfSyllablesInMultiWordLyric() {
        Song song = SongFactory.createDefaultSong();
        song.addLyric("Happy Birthday Mary");

        Lyric lyric = song.getLyrics().get(0);
        assertEquals(6, lyric.getSyllableCount());
    }
}
