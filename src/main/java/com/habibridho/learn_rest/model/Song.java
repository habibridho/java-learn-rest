package com.habibridho.learn_rest.model;

import java.time.Duration;

public class Song {
    private final long id;
    private final String title;
    private final String artist;
    private final Duration duration;

    public Song(long id, String title, String artist, Duration duration) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public Duration getDuration() {
        return duration;
    }
}
