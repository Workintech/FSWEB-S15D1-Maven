package org.example.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Grocery {
    public static ArrayList<String> groceryList = new ArrayList<>();

    public void startGrocery(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("0 1 veya 2 giriniz: ");
        String input = scanner.nextLine();
        if(input.equals("0")){
            return;
        }else if(input.equals("1")){
            System.out.print("Eklenmesini istediğiniz elemanları giriniz.");
            String itemsToAdd = scanner.nextLine();
            String[] stringArr = itemsToAdd.split(",\\s*");
            Collections.addAll(groceryList,stringArr);
        }else if(input.equals("2")){
            System.out.print("Cıkarılmasını istediğiniz elemanları giriniz.");
            String itemsToDelete = scanner.nextLine();
            String[] stringArr = itemsToDelete.split(",\\s*");
            groceryList.removeAll(Arrays.asList(stringArr));
        }
        scanner.close();
    }

    public static void addItems(String input){
        String[] stringArr = input.split(",\\s*");

        for (String item : stringArr){
            if (!checkItemIsInList(item)){
                groceryList.add(item);
                Collections.sort(groceryList);
            }
        }

    }

    public static void removeItems(String input){
        String[] stringArr = input.split(",\\s*");
        for (String item : stringArr) {
            groceryList.remove(item);
        }
        Collections.sort(groceryList);
    }

    public static boolean checkItemIsInList(String input){
        return groceryList.contains(input);
    }

    public static void printSorted(){
        Collections.sort(groceryList);
        System.out.println(groceryList);
    }
}
