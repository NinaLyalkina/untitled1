import java.util.*;
import java.util.stream.IntStream;

public class Garage {


    public static void main(String[] args){

        Sedan Toyota = new Sedan();
        Toyota.color = "silver";
        Toyota.horsepower = 250;

        Hatchback Mercedes = new Hatchback();
        Mercedes.color = "red";
        Mercedes.horsepower = 200;

        CrossMotorbike Honda = new CrossMotorbike();
        Honda.color = "red";
        Honda.horsepower = 80;

        SportMotorbike Kawasaki = new SportMotorbike();
        Kawasaki.color = "black";
        Kawasaki.horsepower = 120;

        Van BMW = new Van();
        BMW.color = "green";
        BMW.horsepower = 350;

        Pickup RollsRoyce = new Pickup();
        RollsRoyce.color = "black";
        RollsRoyce.horsepower = 380;

        List<String> list = Arrays.asList(Toyota.color, Mercedes.color, Honda.color, Kawasaki.color, BMW.color, RollsRoyce.color);
        System.out.println("Перечень всех уникальных цветов:");
        list.stream().distinct().forEach(System.out::println);

        int [] arr = {Toyota.horsepower, Mercedes.horsepower, Honda.horsepower, Kawasaki.horsepower, BMW.horsepower,RollsRoyce.horsepower};
        int sum = Arrays.stream(arr).sum();
        System.out.println("Суммарная мощность в лошадиных силах:\n" + sum);
    }
}

