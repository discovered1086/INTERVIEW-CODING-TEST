package com.kingshuk.corejava.algorithms.sorting;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.apache.commons.lang3.time.StopWatch;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@AllArgsConstructor
@Getter
@ToString
class Song {
    private int id;
    private int songDuration;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;
        Song song = (Song) o;
        return id == song.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

@AllArgsConstructor
@Getter
class SongPair {
    private Song firstSong;
    private Song secondSong;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SongPair)) return false;
        SongPair songPair = (SongPair) o;
        return (Objects.equals(firstSong, songPair.firstSong) && Objects.equals(secondSong, songPair.secondSong))
                || (Objects.equals(secondSong, songPair.firstSong) && Objects.equals(firstSong, songPair.secondSong));
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstSong, secondSong);
    }

    @Override
    public String toString() {
        return "SongPair{" +
                "firstSong=" + firstSong +
                ", secondSong=" + secondSong +
                '}' + ": total duration: " + (firstSong.getSongDuration() + secondSong.getSongDuration()) + " seconds" + "\n";
    }
}

public class SongPairPracticeHackerRank {
    private static final StopWatch timer = new StopWatch();

    private static long pairCount(List<Integer> songDurations) {
        List<SongPair> songPairs = new ArrayList<>();
        timer.start();
        for (int i = 0; i < songDurations.size(); i++) {
            Song song = new Song(i, songDurations.get(i));
            List<Song> otherSongs = new ArrayList<>();
            for (int j = 0; j < songDurations.size(); j++) {
                if (i != j) {
                    Song song2 = new Song(j, songDurations.get(j));
                    otherSongs.add(song2);

                }
            }

            for (Song otherSong:otherSongs ) {
                SongPair songPair = new SongPair(song, otherSong);
                if (!songPairs.contains(songPair)
                        && (song.getSongDuration() + otherSong.getSongDuration()) % 60 == 0) {
                    songPairs.add(songPair);
                }
            }

        }

        System.out.println(songPairs);

        timer.stop();
        return songPairs.size();
    }

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numbers.add(random.nextInt(400));
        }
//        numbers = List.of(3, 60, 60, 60);
        System.out.println(numbers.size());

        long l = pairCount(numbers);
        System.out.println("It took " + timer.getTime(TimeUnit.MILLISECONDS) + " milliseconds");
        System.out.println("Result is: " + l);
    }
}
