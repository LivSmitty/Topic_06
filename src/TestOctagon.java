/**
 * Created by scott_000 on 10/7/2016.
 */
public class TestOctagon {
    public static void main(String[] args) {
        Octagon oct1 = new Octagon(5);
        oct1.getArea(5);

        Octagon oct2 = new Octagon(7);
        oct2.getArea(7);
        int result = oct2.compareTo(oct1);
        System.out.println(result);

    }
}
