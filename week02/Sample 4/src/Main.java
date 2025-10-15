import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String name = "";
        short age = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Your name:");
        name = keyboard.nextLine();
        System.out.print("Your age:");
        age = keyboard.nextShort();
        System.out.printf("%s님의 나이는 %d살 입니다.\n", name,age);
    }
}