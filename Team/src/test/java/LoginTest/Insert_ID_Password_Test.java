package LoginTest;

import java.util.*;
import Login.LoginServiceImpl;
import Storage.Information_Storage;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class Insert_ID_Password_Test {


        LoginServiceImpl LS = new LoginServiceImpl();
        Information_Storage IS = new Information_Storage();





    @Test
    //4번째 5번째 자리가 18이 아닐경우.
    void 컴퓨터공학과가아닐때() {

        String Example1_id = "20201208";

        Assertions.assertThat(Example1_id.substring(4,6)).isEqualTo("14");


    }



    @Test
    void 학생회이름을잘못입력했을때() {




        String Example_name = "김아무개";

        Assertions.assertThat(IS.Council_Info).isEqualTo(Example_name);
//        Assertions.assertThat(IS.Council_Info).containsValue(Example_name);


    }
    @Test
    void 입력한학번이올바를경우와올바르지않을경우() {


        String Example_id1 = "20201400";
        String Example_name1= "김현수";


        String Example_id2 = "20201405";
        String Example_name2 = "누구세요";

        HashMap<String,String>Example_storage = new HashMap<>();

        Example_storage.put(Example_id1,Example_name1);
        Example_storage.put(Example_id2,Example_name2);


//        Assertions.assertThat(Example_storage).isSameAs(IS.Council_Info.containsKey(Example_id1));
//        Assertions.assertThat(Example_storage).isSameAs(IS.Council_Info.containsKey(Example_id2));


        Assertions.assertThat(IS.Council_Info).containsEntry(Example_id1,Example_name1);

        Assertions.assertThat(IS.Council_Info).containsEntry(Example_id2,Example_name2);




//        Assertions.assertThat(IS.Council_Info).isEqualTo(Example_Id2);




    }

}
