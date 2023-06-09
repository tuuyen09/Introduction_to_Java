package Point;

public class Point2D {
    private float x;
    private float y;


    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D(){

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY (){
        float[] arr = {x,y};
        return arr;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x = " + x + " y = " + y;
    }
}
class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(1,2);
        System.out.println(point2D);
    }
}
