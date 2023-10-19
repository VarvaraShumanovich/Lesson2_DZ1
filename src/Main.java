
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите наименование товара: ");
        String наименование = scanner.nextLine();
        System.out.print("Введите количество товара: ");
        int количество = scanner.nextInt();
        scanner.nextLine();
        System.out.print("введите ваш номер телефона: ");
        String номер = scanner.nextLine();
        System.out.print("Введите адрес доставки: ");
        String адрес = scanner.nextLine();
        System.out.printf("Ваш заказ принят. Товар: %s в количестве: %d прибудет к вам в ближайшее время. Товар доставим по адресу: %s . Ваш контактный номер: %s\n", наименование, количество, адрес, номер);
        scanner.close();
    }
}