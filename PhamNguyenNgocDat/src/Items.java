import java.util.Scanner;

public class Items {
    private static Item[] items;
    private final int SIZE = 5;

    public Items() {
    }

    public Items(int capacity) {
        items = new Item[capacity];
    }

    public Item get(int index) {
        return items[index];
    }

    public int getSize() {
        return SIZE;
    }

    // Câu 1
    public void addFiveItems() {
        Items items = new Items(SIZE);
        int i = 0;
        Scanner input = new Scanner(System.in);
        while (i < SIZE) {
            System.out.println("Nhập vật phẩm thứ " + (i + 1));
            System.out.print("Nhập tên vật phẩm: ");
            String name = input.nextLine();
            System.out.print("Nhập chỉ số sức mạnh: ");
            int powerIndex = Integer.parseInt(input.nextLine());
            System.out.print("Nhập hệ số sức mạnh: ");
            double powerFactor = Double.parseDouble(input.nextLine());
            System.out.print("Nhập số vàng quy đổi trên 1 sức công phá: ");
            int quantity = Integer.parseInt(input.nextLine());
            Items.items[i] = new Item(name, powerIndex, powerFactor, quantity);
            i++;

            System.out.println();
        }
    }

    // Câu 2
    public void printFiveItems() {
        System.out.println("===== Danh sách vật phẩm =====\n");
        for (int i = 0; i < SIZE; i++) {
            System.out.println("Vật phẩm thứ " + (i + 1));
            System.out.println(items[i]);
            System.out.println();
        }
    }

    // Câu 3
    public String mostExpensiveItem() {
        double maxPrice = items[0].getPrice();
        int index = 0;
        for (int i = 1; i < SIZE; i++) {
            if (items[i].getPrice() > maxPrice) {
                maxPrice = items[i].getPrice();
                index = i;
            }
        }
        return items[index].getName();
    }

    // Câu 4
    public boolean saved() {
        // Get total prices of all items
        double total = 0;
        for (int i = 0; i < SIZE; i++) {
            total += items[i].getPrice();
        }

        // Input the total number of coins that Spon collected
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số xu vàng mà Spon thu được: ");
        double coins = Double.parseDouble(input.nextLine());
        System.out.println();
        return coins >= total;
    }
}
