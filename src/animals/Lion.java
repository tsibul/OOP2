package animals;

public class Lion extends Animal {

    protected static final int MAX_WEIGHT = 80;
    protected static final String type = "lion";

    private int maneVolume;

    public Lion(String nickName, int yearBirth, int weight, int legs, int maneVolume) {
        super(nickName, yearBirth, weight, legs);
        this.maneVolume = maneVolume;
    }

    public int getManeVolume() {
        return maneVolume;
    }

    public void setManeVolume(int maneVolume) {
        this.maneVolume = maneVolume;
    }

    public String getType() {
        return type;
    }

    @Override
    public int getMAX_WEIGHT() {
        return MAX_WEIGHT;
    }
}
