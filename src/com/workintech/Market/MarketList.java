package com.workintech.Market;

import java.util.*;

public class MarketList {
    List<String> groceryList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MarketList marketList = new MarketList();
        marketList.transaction();
    }

    public void transaction() {
        while (true) {
            try {
                System.out.println("Ekleme:1 / Çıkarma:2 / Kapatma:0 için tuşlama yapınız lütfen!");
                String process = scanner.next();
                if (process.equals("0")) break;

                switch (process) {
                    case "1":
                        System.out.println("Eklenmesini istediğiniz elemanları giriniz: ");
                        String eklenen = scanner.next();
                        addItems(eklenen);
                        break;

                    case "2":
                        if (groceryList.size() == 0) {
                            System.out.println("Liste bosken eleman cikarilamaz");
                            continue;
                        } else {
                            System.out.println("Cıkarılmasını istediğiniz elemanları giriniz: ");
                            String cikarilan = scanner.next();
                            removeItems(cikarilan);
                            break;
                        }
                    default:
                        System.out.println("Uygun secim yapilmadi.");
                }
                printSorted();

            } catch (Exception ex) {
                System.out.println("Gecersiz secim");
                break;
            }

        }

    }

    public void addItems(String eklenen) {
        String[] itemList = eklenen.split(",");
        for (String item : itemList) {
            if (!checkItemIsInList(item.trim())) {
                groceryList.add(item.trim());
            } else {
                System.out.println(item + " listenizde mevcut.");
            }
        }
    }

    public void removeItems(String cikarilan) {
        String[] itemList = cikarilan.split(",");
        for (String item : itemList) {
            if (checkItemIsInList(item.trim())) {
                groceryList.remove(item.trim());
                System.out.println(item + " listeden cikarildi");
            } else {
                System.out.println(item + " listenizde bulunamadi");
            }
        }
    }

    public boolean checkItemIsInList(String item) {
        return groceryList.contains(item.trim());
    }

    public void printSorted() {
        Collections.sort(groceryList);
        System.out.print("Sirali Liste: ");
        for (String item : groceryList) {
            System.out.print(item + ",");
        }
        System.out.print("\n");
    }

}

