import java.util.Scanner;

/**
 * Created by maria on 8/31/2015.
 */
public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int XcoordA = scanner.nextInt();
        int YcoordA = scanner.nextInt();
        int XcoordB = scanner.nextInt();
        int YcoordB = scanner.nextInt();
        int XcoordC = scanner.nextInt();
        int YcoordC = scanner.nextInt();

        int areaTriangle = XcoordA * (YcoordB - YcoordC) + XcoordB * (YcoordC - YcoordA) + XcoordC * (YcoordA - YcoordB);
        areaTriangle = Math.abs(areaTriangle / 2);

        System.out.println(areaTriangle);
    }
}
