package java8;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Songs {
    public List<Song> getSongs() {
        return new ArrayList() {{
            add(new Song("$10", "Hitchhiker", "Electronic", 2016, 183));
            add(new Song("Havana", "Camila Cabello", "R&B", 2017, 324));
            add(new Song("Cassidy", "Grateful Dead", "Rock", 1972, 123));
            add(new Song("50 ways", "Paul Simon", "Soft Rock", 1975, 199));
            add(new Song("Hurt", "Nine Inch Nails", "Industrial Rock", 1995, 257));
            add(new Song("Silence", "Delerium", "Electronic", 1999, 134));
            add(new Song("Hurt", "Johnny Cash", "Soft Rock", 2002, 392));
            add(new Song("Watercolour", "Pendulum", "Electronic", 2010, 155));
            add(new Song("The Outsider", "A Perfect Circle", "Alternative Rock", 2004, 312));
            add(new Song("With a Little Help from My Friends", "The Beatles", "Rock", 1967, 168));
            add(new Song("Come Together", "The Beatles", "Blues rock", 1968, 173));
            add(new Song("Come Together", "Ike & Tina Turner", "Rock", 1970, 165));
            add(new Song("With a Little Help from My Friends", "Joe Cocker", "Rock", 1968, 46));
            add(new Song("Immigrant Song", "Karen O", "Industrial Rock", 2011, 12));
            add(new Song("Breathe", "The Prodigy", "Electronic", 1996, 337));
            add(new Song("What's Going On", "Gaye", "R&B", 1971, 420));
            add(new Song("Hallucinate", "Dua Lipa", "Pop", 2020, 75));
            add(new Song("Walk Me Home", "P!nk", "Pop", 2019, 459));
            add(new Song("I am not a woman, I'm a god", "Halsey", "Alternative Rock", 2021, 384));
            add(new Song("Pasos de cero", "Pablo Alborán", "Latin", 2014, 117));
            add(new Song("Smooth", "Santana", "Latin", 1999, 244));
            add(new Song("Immigrant song", "Led Zeppelin", "Rock", 1970, 484));
        }};
    }

    public static void main(String[] args) {
        Songs songs = new Songs();
        List<Song> songList = songs.getSongs();

        // ORDER MATTERS
        List<String> genres = songList.stream().map(song -> song.getGenre())
                .distinct()
                .collect(toList());
        System.out.println("genres = " + genres);

        System.out.println(songList.stream().map(song -> song.getGenre())
                .distinct()
                .count());

        //Top Five Songs
        List<String> topFive = songList.stream()
                .sorted(Comparator.comparingInt(Song::getTimesPlayed))
                .map(song -> song.getTitle())
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(topFive);

        search(songList, "The Beatles");
        search(songList, "The Beach Boys");
    }

    static void search(List<Song> songList, String artist) {
        Optional<Song> result = songList.stream()
                .filter(song -> song.getArtist().equals(artist))
                .findFirst();
        if (result.isPresent()) {
            System.out.println(result.get().getTitle());
        } else {
            System.out.println("No songs found by: " + artist);
        }
    }

}
