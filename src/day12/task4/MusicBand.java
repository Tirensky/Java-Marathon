package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int foundationYear;

    private List<String> members;

    public MusicBand(String name, int foundationYear, List<String> members) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.members = members;
    }

    public List<String> getMembers() {
        return members;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void addMember(String name) {
        members.add(name);
    }

    public void removeMember(String name) {
        members.remove(name);
    }

    public void printMembers() {
        System.out.println(members);
    }

    @Override
    public String toString() {
        return "MusicBand { " +
                "name='" + name + '\'' +
                ", foundationYear=" + foundationYear +
                ", members=" + members +
                " }";
    }

    public static void transferMembers(MusicBand from, MusicBand to) {
        for (String member : from.getMembers()) {
            to.getMembers().add(member);
        }
        from.getMembers().clear();
    }
}
