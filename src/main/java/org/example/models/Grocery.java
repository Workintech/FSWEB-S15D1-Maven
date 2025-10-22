package org.example.models;

import java.util.*;

public class Grocery {
    public static ArrayList<String> groceryList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void startGrocery() {
        boolean quit = false;
        while (!quit) {
            System.out.println("""
                \nLütfen işlem seçiniz:
                0 - Uygulamayı kapat
                1 - Ürün ekle
                2 - Ürün çıkar
                Liste: """ + groceryList);
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0 -> quit = true;
                case 1 -> {
                    System.out.println("Eklenmesini istediğiniz eleman(ları) giriniz:");
                    String input = scanner.nextLine();
                    addItems(input);
                }
                case 2 -> {
                    System.out.println("Çıkarılmasını istediğiniz eleman(ları) giriniz:");
                    String input = scanner.nextLine();
                    removeItems(input);
                }
                default -> System.out.println("Geçersiz seçim.");
            }
        }
        System.out.println("Uygulama sonlandırıldı.");
    }

    public static void addItems(String input) {
        String[] items = input.split(",");
        for (String i : items) {
            String item = i.trim().toLowerCase();
            if (!checkItemIsInList(item)) {
                groceryList.add(item);
            }
        }
        printSorted();
    }

    public static void removeItems(String input) {
        String[] items = input.split(",");
        for (String i : items) {
            groceryList.remove(i.trim().toLowerCase());
        }
        printSorted();
    }

    public static boolean checkItemIsInList(String product) {
        return groceryList.contains(product.toLowerCase());
    }

    public static void printSorted() {
        Collections.sort(groceryList);
        System.out.println("Güncel Liste: " + groceryList);
    }
}
