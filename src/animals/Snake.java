package animals;

public class Snake extends Animal {

    protected static final int MAX_WEIGHT = 20;
    protected static final String type = "snake";

    private int bodyLength;

    public Snake(String nickName, int yearBirth, int weight, int legs, int bodyLength) {
        super(nickName, yearBirth, weight, legs);
        this.bodyLength = bodyLength;
    }

    public int getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(int bodyLength) {
        this.bodyLength = bodyLength;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getmaxWeight() {
        return MAX_WEIGHT;
    }

}
