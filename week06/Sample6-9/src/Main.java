import java.awt.event.WindowFocusListener;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int CIGA = 7;
        final int YEAR = 365;
        int life;
        int ga;

        int minute;
        int year =0;
        int day = 0;
        int hour = 0;
        long temp = 0;

        System.out.print("당신 몇년 동안 담배를 피웠나요? ");
        life=keyboard.nextInt();
        System.out.print("하루에 평균 몇개피를 피웠나요? ");
        ga=keyboard.nextInt();

        minute = life * YEAR * ga;
        temp = minute * CIGA;
        day = (int)temp/(60*24);
        year = day / YEAR;
        day -= (year*YEAR);
        temp -= ((year*YEAR+day)*24*60);
        hour = (int)temp/60;
        temp -= (hour*60);

        System.out.printf("담배 1개피는 %d분의 쟁명을 단축 합니다 \n", CIGA);
        System.out.printf("%d년 동안 %d 개피의 담배룰 피우면 %d분의 생명이 단축 됩니가 \n ", life, ga, minute);
        System.out.printf("%,d분은 %d년 %d일 %d시간 %d분 입니다 \n", minute, year, day, hour, temp);
    }
}