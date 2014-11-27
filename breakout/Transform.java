package breakout;

public class Transform {
    public int x;
    public int y;

    public Transform() {
        this(0,0);
    }

    public Transform(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setTrans(Transform a) {
        x = a.x;
        y = a.y;
    }
}
