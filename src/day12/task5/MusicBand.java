package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int foundationYear;

    private List<MusicArtist> members;

    public MusicBand(String name, int foundationYear, List<MusicArtist> members) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.members = members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void addMember(MusicArtist name) {
        members.add(name);
    }

    public void removeMember(MusicArtist name) {
        members.remove(name);
    }

    public void printMembers() {
        System.out.println(members);
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        for (MusicArtist member : band1.getMembers()) {
            band2.getMembers().add(member);
        }
        band1.getMembers().clear();
    }

    @Override
    public String toString() {
        return "MusicBand { " +
                "name='" + name + '\'' +
                ", foundationYear=" + foundationYear +
                ", members=" + members +
                " }";
    }
}
