package com.arkvis.songbard;

public class Lyric {
    private final int syllableCount;
    private final String line;

    Lyric(Grammarian grammarian, String line) {
        syllableCount = grammarian.count(line);
        this.line = line;
    }

    public String getLine() {
        return line;
    }

    public int getSyllableCount() {
        return syllableCount;
    }
}
