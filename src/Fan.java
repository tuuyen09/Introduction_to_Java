public class Fan {
    int SlOW = 1;
    int MEDIUM = 2;
    int FAST = 3;
    private int speed = SlOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {

    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
   public String toString(){
        if(on){
            return ("Speed =" + speed + " color: " + color + " radius = " + radius + " fan is on");
        }else {
            return ("Color: " + color + " radius = " + radius + " fan is off");
        }

   }
}
class TestFan {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.setSpeed(fan.FAST);
        fan.setOn(true);
        fan.setRadius(10);
        fan.setColor("Purple");
        System.out.println(fan);
    }
}