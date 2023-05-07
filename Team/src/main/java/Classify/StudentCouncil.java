package Classify;

import Exception_EE.Program_Exit;

import java.util.Scanner;

public class StudentCouncil implements StudentCouncill_menu {

    Scanner scan = new Scanner(System.in);
    Program_Exit program_exit = new Program_Exit();

    int number  ;

    @Override

    public void Choice_Menu() {
        System.out.println("메뉴를 선택해주세요.");
        System.out.println("1.계좌조회");
        System.out.println("2.계좌송금");
        System.out.println("3.출금");
        System.out.println("4.사용종료");

        number = scan.nextInt();

        if(number == 1) {

        }

        if(number == 2) {

        }

        if(number == 3) {

        }

        if(number == 4) {

            program_exit.Exit();
        }

    }





}
