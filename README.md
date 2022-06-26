# Songbard - Songwriting tools

### Usage

#### Create a song

``` java
Song song = SongFactory.createDefaultSong();
```

#### Add lyrics

``` java
song.addLyric("Happy birthday to you");
song.addLyric("Happy birthday little Timmy");
```

#### Get lyrics

``` java
List<Lyric> lyrics = song.getLyrics();
String lyric = lyrics.get(0).getLine();
```

#### Replace lyrics

``` java
Lyric lyric = lyrics.get(0);
song.replaceLyric(lyric, "New line");
```

#### Lyric syllable count

``` java
lyric.getSyllableCount();
```
