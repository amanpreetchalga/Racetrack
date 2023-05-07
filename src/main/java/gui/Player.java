package gui;

public class Player {

    private final boolean active;
    private final String name;
    private final boolean ai;
    private final int[] current;
    private final int[] last;
    private final int lap;

    public Player(boolean active, String name, boolean ai, int[] current, int[] last, int lap) {
        this.active = active;
        this.name = name;
        this.ai = ai;
        this.current = current;
        this.last = last;
        this.lap = lap;
    }
}
