package com.sda.controler;

//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;
//import javax.faces.bean.SessionScoped;
import java.io.Serializable;

//@ManagedBean(name = "controllerLogin")
//@SessionScoped
public class Login implements Serializable {
    private String introducedUser;
    private String introducedPass;

    public static final String username = "mihai";
    public static final String pssword = "1234";

    public String login() {

        return "loggedOn";
    }


    public boolean hasRights(String username, String password) {

        if (introducedUser.equals(username) && introducedPass.equals(password)) {
            System.out.println("user have rights to authentificate");
            return true;
        }
        System.out.println("user od not have rights to authentificate");
        return false;
    }

    public String getIntroducedUser() {
        return introducedUser;
    }

    public void setIntroducedUser(String introducedUser) {
        this.introducedUser = introducedUser;
    }

    public String getIntroducedPass() {
        return introducedPass;
    }

    public void setIntroducedPass(String introducedPass) {
        this.introducedPass = introducedPass;
    }
}
