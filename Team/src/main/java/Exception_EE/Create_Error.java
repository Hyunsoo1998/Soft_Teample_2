package Exception_EE;

public class Create_Error {


    public void Incollect_Information() {

        String Message = "입력 정보가 잘못 되었습니다. 프로그램을 종료합니다.";



        throw new RuntimeException(Message);


    }



}
