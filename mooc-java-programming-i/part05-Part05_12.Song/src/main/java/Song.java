
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (!(other instanceof Song)) {
            return false;
        }

        Song comparedSong = (Song) other;

        if (this.name.equals(comparedSong.name) &&
            this.artist.equals(comparedSong.artist) &&
            this.durationInSeconds == comparedSong.durationInSeconds) {
                return true;
            }

        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
