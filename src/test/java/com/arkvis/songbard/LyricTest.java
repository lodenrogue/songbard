package com.arkvis.songbard;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LyricTest {

    @Test
    void should_returnCorrectLyrics_when_addingLyrics() {
        String firstLine = "This is a line";
        String secondLine = "This is another line";

        Song song = SongFactory.createDefaultSong();
        song.addLyric(firstLine);
        song.addLyric(secondLine);

        List<Lyric> lyrics = song.getLyrics();
        assertEquals(2, lyrics.size());

        assertEquals(firstLine, lyrics.get(0).getLine());
        assertEquals(secondLine, lyrics.get(1).getLine());
    }

    @Test
    void should_removeLyricFromSong_when_removingLyric() {
        String remainingLine = "Remaining line";
        String lineToRemove = "Line to remove";

        Song song = SongFactory.createDefaultSong();
        song.addLyric(remainingLine);
        song.addLyric(lineToRemove);

        song.removeLyric(song.getLyrics().get(1));
        List<Lyric> lyrics = song.getLyrics();

        assertEquals(1, lyrics.size());
        assertEquals(remainingLine, lyrics.get(0).getLine());
    }

    @Test
    void should_correctlyReplaceLyric_when_replacingLyric() {
        String unchangedLine = "Unchanged line";
        String changingLine = "Changing line";
        String newLine = "new line";

        Song song = SongFactory.createDefaultSong();
        song.addLyric(unchangedLine);
        song.addLyric(changingLine);

        song.replaceLyric(song.getLyrics().get(1), newLine);
        List<Lyric> lyrics = song.getLyrics();

        assertEquals(2, lyrics.size());
        assertEquals(unchangedLine, lyrics.get(0).getLine());
        assertEquals(newLine, lyrics.get(1).getLine());
    }

    @Test
    void should_throwException_when_attemptingToReplaceLyricThatDoesNotExistInSong() {
        Song song = SongFactory.createDefaultSong();
        song.addLyric("This is a line");

        List<Lyric> lyrics = song.getLyrics();
        Lyric lyric = lyrics.get(0);

        song.removeLyric(lyric);
        assertThrows(IllegalArgumentException.class, () -> song.replaceLyric(lyric, "New line"));
    }
}
