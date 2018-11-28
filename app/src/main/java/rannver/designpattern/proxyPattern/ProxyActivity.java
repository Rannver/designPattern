package rannver.designpattern.proxyPattern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import rannver.designpattern.R;

/**
 * 代理模式（静态代理模式）
 */
public class ProxyActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.proxy_activity);

        text = findViewById(R.id.text);

        Subject proxy = new Proxy();
        text.setText(proxy.buyMac());

    }




}
