package Classify;

import Exception_EE.Program_Exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NotStudentCouncil {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    Program_Exit PE = new Program_Exit();


    public void NotStudentCouncil_menu(String name) throws IOException {



        System.out.println(name +"님은 비학생회 입니다.");
        System.out.println("메뉴를 선택하세요.");
        System.out.println("1.계좌조회");
        System.out.println("2.프로그램 종료");

        int choice_number  =  Integer.parseInt(br.readLine());


        if(choice_number == 1) {

        }

        if(choice_number == 2)  {
            PE.Exit();
        }


    }


}
