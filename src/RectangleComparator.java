import java.util.Comparator;

public class RectangleComparator implements Comparator<Rectangle> {

    @Override
    public int compare(Rectangle s1, Rectangle s2) {
        if (s1.getArea() > s2.getArea()) return 1;
        else if (s1.getArea() == s2.getArea()) return 0;
        else return -1;
    }
}
