package Exception_EE;

public class Program_Exit {


    public void Exit() {


        Exception exit = new RuntimeException("프로그램을 종료합니다.");

        throw new RuntimeException(exit);


    }

}
