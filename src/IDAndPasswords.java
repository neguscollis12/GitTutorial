import java.util.HashMap;

public class IDAndPasswords {

    HashMap<String, String> logininfo = new HashMap<String,String>();
    IDAndPasswords(){
        logininfo.put("Negus", "Pizza");
        logininfo.put("Reva", "Strawberry");
        logininfo.put("Lelani", "Banana");
        logininfo.put("Layla", "Milk");
        logininfo.put("Fenton", "Candy");
    }

  protected HashMap getLoginInfo(){
        return logininfo;
    }



}
