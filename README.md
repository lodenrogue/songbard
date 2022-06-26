# Songbard - Songwriting tools

### Usage

#### Create a song

``` java
Song song = SongFactory.createDefaultSong();
```

#### Lyrics

``` java
// Add lyrics
song.addLyric("Happy birthday to you");
song.addLyric("Happy birthday little Timmy");

// Get lyrics
List<Lyric> lyrics = song.getLyrics();

// Get line
Lyric lyric = lyrics.get(0);
String line = lyric.getLine();

// Replace lyrics
song.replaceLyric(lyric, "New line");

// Remove lyrics
song.removeLyric(lyric);
```


#### Lyric syllable count

``` java
lyric.getSyllableCount();
```
