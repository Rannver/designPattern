package rannver.designpattern.prototypePattern;


/**
 * Created by Rannver on 2018/3/15.
 */

public class LoginImpl implements Login {

    @Override
    public void login() {
        User user = new User();
        user.setAge(22);
        user.setName("Mr.Simple");
        user.setAddress(new Address("北京","海淀","花园东路"));
        LoginSession.getLoginSession().setLoginSessionUser(user);
    }

}
