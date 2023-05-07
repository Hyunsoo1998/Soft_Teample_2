package Service;

import Classify.StudentCouncil;
import Login.LoginServiceImpl;
import Storage.Information_Storage;
import java.util.*;

import java.io.*;


//서비스 구현부
public class Service_Start {

    public static void main(String[] args) throws IOException{


        StudentCouncil  SC = new StudentCouncil();
        LoginServiceImpl LsImpl = new LoginServiceImpl();
        Information_Storage Ifs = new Information_Storage();

        // 학생회 키,값이 들어있는 메소드 호출해서 값 저장
        // 잔액(잔고)에대한 메소드 호출해서 값 할당.

        LsImpl.LoginService_logic();
        SC.Choice_Menu();

//        Iterator<String>key_it = Ifs.Council_Info.keySet().iterator();
//
//        while(key_it.hasNext()) {
//
//            String keys = key_it.next();
//            System.out.println("Key : " + keys);
//
//        }
//
//        Iterator<String>value_it = Ifs.Council_Info.values().iterator();
//
//        while(value_it.hasNext()) {
//            String values = value_it.next();
//            System.out.println("value : " + values);
//        }




    }

}
