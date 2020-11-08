package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String nameBand;
    private int year;
    private List<MusicArtist> members = new ArrayList();

    public MusicBand(String nameBand, int year, List<MusicArtist> members) {
        this.nameBand = nameBand;
        this.year = year;
        this.members = members;
    }

    @Override
    public String toString() {
        return " MusicBand{" +
                "nameBand='" + nameBand + '\'' +
                ", year=" + year +
                ", fullNameList=" + members +
                '}';
    }

    public int getYear() {
        return year;
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        for (MusicArtist artist : musicBand1.getMembers()){
        musicBand2.getMembers().add(artist);
        }
        musicBand1.getMembers().clear();
    }


    public List<MusicArtist> getMembers() {
        return members;
    }

    public void printMembers() {
        System.out.println(members);
    }
}
