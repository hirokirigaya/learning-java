package co.danieldev.oneforall.javacore.Ainitializationblock.domain;

public class Anime {

    private String name;
    private int[] episodes;

    {
        System.out.println("Inside initialization block");
        episodes = new int[100];
        for (int i = 0; i < 100; i++) {
            episodes[i] = i;
        }

        for (int episode: episodes) {
            System.out.print(episode + " ");
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int[] episodes) {
        this.episodes = episodes;
    }
}
