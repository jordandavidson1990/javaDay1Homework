public class WaterBottle {

    private int volume;

    public WaterBottle(){
        this.volume = 100;
    }

    public int getVolume() {
        return volume;
    }

    public void subtract10FromVolume() {
        volume -= 10;
    }

    public int emptyBottle() {
        return volume = 0;
    }

    public int fillBottle() {
        return volume = 100;
    }
}
