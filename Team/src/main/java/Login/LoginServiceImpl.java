package Login;


import java.io.*;

import Classify.NotStudentCouncil;
import Classify.StudentCouncil;
import Exception_EE.*;

public class LoginServiceImpl {


        public void LoginService_logic() throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


                Create_Error e = new Create_Error();


                System.out.println("학번을 입력하세요. 예시: 2020xxxx");
                String Id = br.readLine();
                System.out.println("비밀번호를 입력하세요.");
                String name = br.readLine();

                LoginRepository loginRepository = new LoginRepository(Id,name);
                StudentCouncil SC = new StudentCouncil();
                NotStudentCouncil NC = new NotStudentCouncil();


                //Ex: 20171740
                //4번째 인덱스 5번째 인덱스가 17일때 컴퓨터공학과 이므로 컴퓨터공학과인 학생만 로그인처리.

                //학번과 이름이 일치 할 경우 학생회 계좌로 이동.
                if(Id.equals(Id.substring(4,6)=="14")) {

                        //20201400 "김현수"


                        if (name.equals(loginRepository.Client_Info_store.values())) {
                                SC.Choice_Menu();

                                //                               SI.Client_Login.put(Id, pw);
                        }

                        //컴퓨터공학과 학번이지만, 이름이 학생회로 등록되지 않을경우 비학생회 메뉴로 이동.
                        else if(!name.equals(loginRepository.Client_Info_store.values())){
                                NC.NotStudentCouncil_menu(name);

                        }

                }else {
                        e.Incollect_Information();

                }



                }



}
