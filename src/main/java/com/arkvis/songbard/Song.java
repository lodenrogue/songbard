package com.arkvis.songbard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Song {
    private final Grammarian grammarian;
    private final List<Lyric> lyrics;

    Song(Grammarian grammarian) {
        this.grammarian = grammarian;
        lyrics = new ArrayList<>();
    }

    public void addLyric(String line) {
        lyrics.add(new Lyric(grammarian, line));
    }

    public List<Lyric> getLyrics() {
        return Collections.unmodifiableList(lyrics);
    }

    public void removeLyric(Lyric lyric) {
        lyrics.remove(lyric);
    }

    public void replaceLyric(Lyric lyric, String newLine) {
        if (lyrics.contains(lyric)) {
            int index = lyrics.indexOf(lyric);
            lyrics.set(index, new Lyric(grammarian, newLine));
        } else {
            throw new IllegalArgumentException("Lyric attempting to be replaced does not exist in song");
        }
    }
}
