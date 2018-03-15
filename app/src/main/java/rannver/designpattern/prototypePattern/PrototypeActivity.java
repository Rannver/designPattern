package rannver.designpattern.prototypePattern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rannver.designpattern.R;

/**
 * Created by Rannver on 2018/3/15.
 */

public class PrototypeActivity extends AppCompatActivity {

    @BindView(R.id.btu_old)
    Button btuOld;
    @BindView(R.id.btu_new)
    Button btuNew;
    @BindView(R.id.tv_str)
    TextView tvStr;

    private User oldUser;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prototype_activity);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btu_old, R.id.btu_new})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btu_old:
                LoginImpl loginImpl = new LoginImpl();
                loginImpl.login();
                oldUser = LoginSession.getLoginSession().getUser();
                break;
            case R.id.btu_new:
                User user = LoginSession.getLoginSession().getUser();
                user.setAddress(new Address("深圳","宝安","新一路"));
                LoginSession.getLoginSession().setLoginSessionUser(user);

                tvStr.setText(oldUser.toString()+"\n\n"+LoginSession.getLoginSession().getUser().toString());
                break;
        }
    }
}
