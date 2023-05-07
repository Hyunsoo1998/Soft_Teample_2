package Login;

import Storage.*;

import Storage.Information_Storage;


import java.util.*;


public class LoginRepository {

    //Client_Info_store와 비교하여 입력한 학번과 비밀번호가 일치하는지 확인하는 HashMap
    Information_Storage IS = new Information_Storage();

    ///아이디와 패스워드를 저장하는 HashMap
    HashMap<String,String> Client_Info_store = new HashMap<>();
    private String Id;
    private String name;

    public LoginRepository(String Id, String name) {

        this.Id = Id;
        this.name  = name;

        Client_Info_store.put(this.Id,this.name);


    }
    public void LoginLogic() {

        String Client_Id = this.Id;
        String Client_name = this.name;

       if(IS.Council_Info.containsKey(Client_Id)) {
           if (IS.Council_Info.containsValue(Client_name)){



       }
    }


    }

}
