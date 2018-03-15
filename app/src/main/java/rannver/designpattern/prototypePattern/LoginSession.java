package rannver.designpattern.prototypePattern;

import android.util.Log;

/**
 * Created by Rannver on 2018/3/15.
 */

public class LoginSession {

    static LoginSession loginSession = null;

    private User user;

    private LoginSession(){};

    static LoginSession getLoginSession(){
        if (loginSession==null){
            Log.d("111", "getLoginSession: ");
            loginSession = new LoginSession();
        }
        return loginSession;
    }

    public void setLoginSessionUser(User user){
        this.user = user;
    }

    public User getUser() {
        return user.clone();
    }


}
