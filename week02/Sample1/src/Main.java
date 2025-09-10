import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //preps
        Scanner keyboard = new Scanner(System.in);
        String name = "";
        //input
        System.out.print("당신의 이름은? : ");
        name = keyboard.nextLine();
        //process

        //output
        System.out.println("이름: " + name);
    }
}