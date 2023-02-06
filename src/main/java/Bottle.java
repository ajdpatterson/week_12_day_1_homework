public class Bottle {
    private int volume;
    private int newVolume;

    public Bottle(int volume) {
        this.volume = volume;
    }
    public int getVolume() {
        return this.volume;
    }

    public int sipBottle() {
        return this.volume -= 10;
    }

    public int emptyBottle() {
        return this.volume = 0;
    }

    public int fillBottle() {
        return this.volume = 100;
    }
}
