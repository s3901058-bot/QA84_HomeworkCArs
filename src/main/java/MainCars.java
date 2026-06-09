import java.util.*;


public class MainCars {

    public static void main(String[] args) {
        Cars c2 = new Cars("Audi A4", 2019, 1002);
        Cars c1 = new Cars("BMW X5", 2020, 1001);
        Cars c3 = new Cars("Mercedes C200", 2021, 1003);
        Cars c4 = new Cars("Volkswagen Golf", 2018, 1004);
        Cars c5 = new Cars("Toyota Camry", 2022, 1005);
        Cars c6 = new Cars("Honda Civic", 2020, 1006);
        Cars c9 = new Cars("Kia Sportage", 2023, 1009);
        Cars c7 = new Cars("Ford Focus", 2017, 1007);
        Cars c8 = new Cars("Skoda Octavia", 2021, 1008);
        Cars c10 = new Cars("Hyundai Tucson", 2022, 1010);


        TreeSet<Cars> tars = new TreeSet<>();
        tars.add(c1);
        tars.add(c2);
        tars.add(c3);
        tars.add(c4);
        tars.add(c5);
        tars.add(c6);
        tars.add(c7);
        tars.add(c8);
        tars.add(c9);
        tars.add(c10);
        System.out.println("TreeSet");
        PrintCars(tars);


        HashSet<Cars> cars = new HashSet<>();
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);
        cars.add(c6);
        cars.add(c7);
        cars.add(c8);
        cars.add(c9);
        cars.add(c10);
        System.out.println("HashSet");
        PrintCars(cars);


    }
    public static void PrintCars(Set<Cars> cars) {
        for (Cars car : cars) {
            System.out.println(car);
        }
        System.out.println("-*-*-*-*-*-*");
    }




}
