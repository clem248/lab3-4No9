import java.util.Arrays;
import java.util.Scanner;

public class Planes {

    public static void main (String... args) {

        String first ="Boeing Renton Factory – 737, BBJ";   //85–215 capacity 1000-2500 km
        String second ="Boeing Everett Factory – 747, 767, 777";  //  467–605 capacity 2500-6000 km
        String third ="Boeing South Carolina – 787";  // 180–375 capacity  less than 1000
        String fourth ="Fabrication Division";  // 301–550 capacity
        String fifth ="Global Partners";  // 210–33 capacity


        String[] name = new String[4];
        int[] capacity = new int[4];
        int[] distance = new int[4];
        int[] loadCapacity = new int[4];
        int[] fuelConsumption = new int[4];

        seveneights seveneights = new seveneights();
        seventh seventh = new seventh();
        firsts firsts = new firsts();
        sevenfourths sevenfourths = new sevenfourths();
        Scanner scan = new Scanner(System.in);

        System.out.println("names----");
        name[0] = seveneights.name;
        name[1] = seventh.name;
        name[2] = firsts.name;
        name[3] = sevenfourths.name;
        //System.out.println(Arrays.toString(name));
        Arrays.stream(name).forEach(System.out::println);

        System.out.println("man----");
        capacity[0] = seveneights.capacity;
        capacity[1] = seventh.capacity;
        capacity[2] = firsts.capacity;
        capacity[3] = sevenfourths.capacity;
        System.out.println(Arrays.toString(capacity));
        Arrays.stream(capacity).forEach(System.out::println);


        System.out.println("km---->");
        distance[0] = seveneights.distance;
        distance[1] = seventh.distance;
        distance[2] = firsts.distance;
        distance[3] = sevenfourths.distance;
        System.out.println(Arrays.toString(distance));
        Arrays.stream(distance).forEach(System.out::println);


        System.out.println("goods-kilo");
        loadCapacity[0] = seveneights.loadCapacity;
        loadCapacity[1] = seventh.loadCapacity;
        loadCapacity[2] = firsts.loadCapacity;
        loadCapacity[3] = sevenfourths.loadCapacity;
        System.out.println(Arrays.toString(loadCapacity));
        Arrays.stream(loadCapacity).forEach(System.out::println);


        System.out.println("fuel-kilo");
        fuelConsumption[0] = seveneights.fuelConsumption;
        fuelConsumption[1] = seventh.fuelConsumption;
        fuelConsumption[2] = firsts.fuelConsumption;
        fuelConsumption[3] = sevenfourths.fuelConsumption;
        System.out.println(Arrays.toString(fuelConsumption));
        Arrays.stream(fuelConsumption).forEach(System.out::println);
        Arrays.sort(fuelConsumption);



        distance distance1 = new distance();
        distance1.distance();
        fuelConsumption1 fuelConsumption1 = new fuelConsumption1();
        System.out.println("Write the number of how much fuel it uses!");
        int target = scan.nextInt();
        fuelConsumption1.finder(fuelConsumption, target);





    }

}
