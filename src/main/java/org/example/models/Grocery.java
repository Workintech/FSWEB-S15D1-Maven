package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Grocery {
    public static ArrayList<String> groceryList = new ArrayList<>();

    public static void startGrocery() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Lütfen bir seçenek giriniz (0: Durdur, 1: Ekle, 2: Çıkar):");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Dummy read for newline

            if (choice == 0) {
                System.out.println("Uygulama durduruldu.");
                break;
            } else if (choice == 1) {
                System.out.println("Eklenmesini istediğiniz elemanları giriniz (tek veya virgülle ayırarak):");
                String input = scanner.nextLine();
                addItems(input);
            } else if (choice == 2) {
                System.out.println("Çıkarılmasını istediğiniz elemanları giriniz (tek veya virgülle ayırarak):");
                String input = scanner.nextLine();
                removeItems(input);
            } else {
                System.out.println("Geçersiz seçenek!");
            }
        }
    }

    public static void addItems(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            String trimmed = item.trim();
            if (!checkItemIsInList(trimmed)) {
                groceryList.add(trimmed);
            } else {
                System.out.println(trimmed + " zaten listede var.");
            }
        }
        printSorted();
    }

    public static void removeItems(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            String trimmed = item.trim();
            if (checkItemIsInList(trimmed)) {
                groceryList.remove(trimmed);
            } else {
                System.out.println(trimmed + " listede bulunamadı.");
            }
        }
        printSorted();
    }

    public static boolean checkItemIsInList(String product) {
        return groceryList.contains(product);
    }

    public static void printSorted() {
        Collections.sort(groceryList);
        System.out.println("Güncel Pazar Listesi: " + groceryList);
    }
}