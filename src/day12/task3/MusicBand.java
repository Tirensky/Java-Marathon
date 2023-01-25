package day12.task3;

public class MusicBand {
    private String name;
    private int foundationYear;

    public MusicBand(String name, int foundationYear) {
        this.name = name;
        this.foundationYear = foundationYear;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    @Override
    public String toString() {
        return "MusicBand { " +
                "name='" + name + '\'' +
                ", foundationYear=" + foundationYear +
                " }";
    }
}
