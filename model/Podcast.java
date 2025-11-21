package model;

public class Podcast {

    private String podcastName;
    private int podcastlenMIN;

    public Podcast() {
    }

    public Podcast(String podcastName, int podcastlenMIN) {
        this.podcastName = podcastName;
        this.podcastlenMIN = podcastlenMIN;
    }

    public String getPodcastName() {
        return podcastName;
    }

    public void setPodcastName(String podcastName) {
        this.podcastName = podcastName;
    }

    public int getPodcastlenMIN() {
        return podcastlenMIN;
    }

    public void setPodcastlenMIN(int podcastlenMIN) {
        this.podcastlenMIN = podcastlenMIN;
    }

    @Override
    public String toString() {
        return "Podcast{" +
                "podcastName='" + podcastName + '\'' +
                ", podcastlenMIN=" + podcastlenMIN +
                '}';
    }
}
