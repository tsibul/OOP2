package animals;

public class Lion extends Animal implements Comparable<Lion> {

    protected static final int MAX_WEIGHT = 120;
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
    public String toString() {
        return "Lion{" +
                "maneVolume=" + maneVolume +
                ", nickName='" + nickName + '\'' +
                ", yearBirth=" + yearBirth +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int getmaxWeight() {
        return MAX_WEIGHT;
    }

    @Override
    public int compareTo(Lion o) {
        return Integer.compare(o.yearBirth, this.yearBirth);
    }


}
