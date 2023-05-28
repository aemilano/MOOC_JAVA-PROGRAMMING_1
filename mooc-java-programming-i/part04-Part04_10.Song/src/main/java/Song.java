public class Song {
    private String name = "";
    private int length = 0;

    public Song(String initName, int initLength) {
        this.name = initName;
        this.length = initLength;
    }

    public String name() {
        return this.name;
    }

    public int length() {
        return this.length;
    }
}
