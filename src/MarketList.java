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
                        System.out.println("Cıkarılmasını istediğiniz elemanları giriniz: ");
                        String cikarilan = scanner.next();
                        groceryList.remove(cikarilan);
                        break;

                    default:
                        System.out.println("Uygun secim yapilmadi.");
                }

            } catch (Exception ex) {
                System.out.println("Gecersiz secim");
                break;
            }

        }

    }

    public void addItems(String eklenen) {
        String[] itemList = eklenen.split(",");
        for (String item : itemList) {
            if (!groceryList.contains(item.trim())) {
                groceryList.add(item.trim());
            } else {
                System.out.println(item + " listenizde mevcut.");
            }
        }
    }

    public void removeItems(String cikarilan) {
        String[] itemList = cikarilan.split(",");
        for (String item : itemList) {
            if (groceryList.contains(item.trim())) {
                groceryList.remove(item.trim());
                System.out.println(item + " listeden cikarildi");
            } else {
                System.out.println(item + "listenizde bulunamadi");
            }
        }
    }

    public boolean checkItemIsInList(String item) {
        return groceryList.contains(item.trim());
    }

    public void printSorted() {
        Collections.sort(groceryList);
        System.out.println("Sirali Liste: ");
        for (String item : groceryList) {
            System.out.println(item);
        }
    }

}
