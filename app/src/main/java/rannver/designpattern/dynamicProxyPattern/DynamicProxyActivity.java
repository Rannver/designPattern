package rannver.designpattern.dynamicProxyPattern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import rannver.designpattern.R;

public class DynamicProxyActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.proxy_activity);
        text = findViewById(R.id.text);
        DynamicProxy dynamicProxy = new DynamicProxy();
        Buyer1 by1 = new Buyer1();
        Buyer2 by2 = new Buyer2();
        Subject by1_dy = (Subject) dynamicProxy.newProxyInstance(by1);
        String s = by1_dy.buy();
        Subject by2_dy = (Subject) dynamicProxy.newProxyInstance(by2);

        s += " &xs "+by2_dy.buy();

        text.setText(s);

    }
}
