package Point;

public class Point3D extends Point2D {
    private float z;
     public Point3D (){

     }
     public Point3D (float z){
         this.z = z;
     }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(){
         float[] arr = {getX(),getY(),z};
         return arr;
    }


    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString() + " z = " + getZ();
    }
}
class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(1,2,3);
        System.out.println(point3D);


    }
}
