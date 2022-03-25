package myPractice.getterSetter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SongApp {
    public static void main(String[] args) {
        Song first = new Song("a", 120, "g");
        Song second = new Song("b", 20, "l");
        Song third = new Song("c", 120, "s");

        List<Song> songList = new ArrayList<>();
        songList.add(first);
        songList.add(second);
        songList.add(third);


        List<String> songTitles = songList.stream().map(Song::getTitle).toList();
        System.out.println(songTitles);
        songTitles.forEach(System.out::println);

        Map<Integer, List<Song>> songDuration = songList.stream().collect(Collectors.groupingBy(Song::getDuration));
        System.out.println(songDuration);
    }


}
