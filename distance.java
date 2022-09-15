import java.util.Arrays;

public class distance {


    void distance() {
        int[] distance1 = new int[4];

        seveneights seveneights = new seveneights();
        seventh seventh = new seventh();
        firsts firsts = new firsts();
        sevenfourths sevenfourths = new sevenfourths();
        distance1[0] = seveneights.distance;
        distance1[1] = seventh.distance;
        distance1[2] = firsts.distance;
        distance1[3] = sevenfourths.distance;
        Arrays.sort(distance1);

        System.out.println("\n\nkm---->");
        System.out.println("Sorted flight distance");

        System.out.println(Arrays.toString(distance1));
    }

}
