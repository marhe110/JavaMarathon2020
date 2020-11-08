package day12.task4;

import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class MusicBand {
    private String nameBand;
    private int year;
    private List<String> members;

    public MusicBand(String nameBand, int year, List<String> members) {
        this.nameBand = nameBand;
        this.year = year;
        this.members = members;
    }

    private void addNameList(String fullName){
        members.add(fullName);
    }

    private void delNameList(String fullName) {
        ListIterator<String> listIterator = members.listIterator();
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            if (element.equals(fullName)) {
                members.remove(element);
            }
        }
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return " MusicBand{" +
                "nameBand='" + nameBand + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }

    public int getYear() {
        return year;
    }

    public List<String> getMembers() {
        return members;
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2){
        int i = 0;
        for (String str : musicBand1.members){
            musicBand2.getMembers().add(str);
        }
        musicBand1.getMembers().clear();



    }

    public void printMembers(){
        System.out.println(members);
    }
}
