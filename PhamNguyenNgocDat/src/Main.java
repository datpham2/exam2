import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Items items = new Items();
        items.addFiveItems();
        items.printFiveItems();

        System.out.println("Vật phẩm cần tốn nhiều xu vàng nhất là " + items.mostExpensiveItem());
        System.out.println();

        if (items.saved()) {
            System.out.println("Spon giải cứu thành công đồng đội của mình!");
        }
        else {
            System.out.println("Spon không thể giải cứu được đồng đội của mình!");
        }
    }
}