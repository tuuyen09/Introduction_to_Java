package ComparableCircle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{

      public ComparableCircle(){}
    public ComparableCircle(double radius){
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filler) {
        super(radius, color, filler);
    }


    @Override
    public int compareTo(ComparableCircle o) {
        if (getArea() > o.getArea()) return 1;
        else if (getArea() < o.getArea()) return -1;
        else return 0;
    }
//    @Override
//    public int compareTo(ComparableCircle  o1, ComparableCircle o2) {
//        if (o1.getArea() > o2.getArea()) return 1;
//        else if (o1.getArea() < o1.getArea()) return -1;
//        else return 0;
//    }

}
