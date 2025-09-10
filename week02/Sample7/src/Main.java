import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name = "";
        short age = 0;
        String address = "";

        System.out.print("Your name: ");
        name = keyboard.nextLine();
        System.out.printf("%s님의 age: ", name);
        age = keyboard.nextShort();
        System.out.print("Your address: ");
        address = keyboard.next();


        System.out.printf("%s님의 나이는 %d살 입니다.\n", name,age);
        System.out.printf("%s님의 주소는 %s 입니다.\n", name, address);
    }
}