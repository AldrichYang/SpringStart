package soundsystem;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

/**
 * Created by yh on 17/11/6.
 */
public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc(@Value("#{systemProperties['disc.title']}") String title,
                     @Value("#{systemProperties['disc.artist']}")  String artist, List<String> tracks) {
        this.artist = artist;
        this.title = title;
        this.tracks = tracks;
    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("-Track: " + track);
        }
    }
}
