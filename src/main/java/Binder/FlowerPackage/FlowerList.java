package Binder.FlowerPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlowerList {
    private List<Flower> flowers;

    // Constructor
    public FlowerList() {
        this.flowers = new ArrayList<>();
    }

    // Function to read and return a FlowerList
    public static FlowerList readFlowerList() {
        FlowerList flowerList = new FlowerList();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of flowers: ");
        int numberOfFlowers = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        for (int i = 0; i < numberOfFlowers; i++) {
            System.out.println("Enter details for flower " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Height (in cm): ");
            int height = scanner.nextInt();
            scanner.nextLine(); // Consume the newline
            System.out.print("Color: ");
            String color = scanner.nextLine();
            System.out.print("Season: ");
            String season = scanner.nextLine();

            Flower flower = new Flower(name, height, color, season);
            flowerList.flowers.add(flower);
        }

        return flowerList;
    }

    // Function to print all flowers with the received color
    public static void printFlowerByColor(FlowerList flowerList, String color) {
        for (Flower flower : flowerList.flowers) {
            if (flower.getColor().equalsIgnoreCase(color)) {
                System.out.println(flower);
            }
        }
    }

    // Function to get the season with the maximum number of flowers
    public static String maxSeason(FlowerList flowerList) {
        java.util.Map<String, Integer> seasonCount = new java.util.HashMap<>();

        for (Flower flower : flowerList.flowers) {
            seasonCount.put(flower.getSeason(), seasonCount.getOrDefault(flower.getSeason(), 0) + 1);
        }

        String maxSeason = null;
        int maxCount = 0;
        for (java.util.Map.Entry<String, Integer> entry : seasonCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxSeason = entry.getKey();
            }
        }

        return maxSeason;
    }

    // Function to delete all flowers with height between min and max
    public static void deleteByHeight(FlowerList flowerList, int min, int max) {
        flowerList.flowers.removeIf(flower -> flower.getHeight() >= min && flower.getHeight() <= max);
    }

    // Function to print all flowers (for testing purposes)
    public void printAllFlowers() {
        for (Flower flower : flowers) {
            System.out.println(flower);
        }
    }

    public static void main(String[] args) {
        // Example usage
        FlowerList flowerList = readFlowerList();
        System.out.println("\nFlowers in the list:");
        flowerList.printAllFlowers();

        System.out.println("\nPrinting flowers with color 'Red':");
        printFlowerByColor(flowerList, "Red");

        String seasonWithMaxFlowers = maxSeason(flowerList);
        System.out.println("\nSeason with the maximum number of flowers: " + seasonWithMaxFlowers);

        System.out.println("\nDeleting flowers with height between 30 and 60 cm...");
        deleteByHeight(flowerList, 30, 60);
        System.out.println("Flowers after deletion:");
        flowerList.printAllFlowers();
    }
}

