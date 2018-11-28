package rannver.designpattern;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import rannver.designpattern.builderPattern.BuilderActivity;
import rannver.designpattern.dynamicProxyPattern.Buyer2;
import rannver.designpattern.dynamicProxyPattern.DynamicProxy;
import rannver.designpattern.dynamicProxyPattern.DynamicProxyActivity;
import rannver.designpattern.prototypePattern.PrototypeActivity;
import rannver.designpattern.proxyPattern.ProxyActivity;
import rannver.designpattern.simpleFactoryPattern.FactoryActivity;

public class MainActivity extends AppCompatActivity {

    Button btuBulider;
    Button btuPrototype;
    Button btuSimpleFactory;
    Button btuProxy;
    Button btuDynamicProxy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //建造者模式
        btuBulider = findViewById(R.id.btu_bulider);
        btuBulider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BuilderActivity.class);
                startActivity(intent);
            }
        });

        btuPrototype = findViewById(R.id.btu_prototype);
        btuPrototype.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PrototypeActivity.class);
                startActivity(intent);
            }
        });

        btuSimpleFactory = findViewById(R.id.btu_simple_factory);
        btuSimpleFactory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FactoryActivity.class);
                startActivity(intent);
            }
        });

        btuProxy = findViewById(R.id.btu_proxy);
        btuProxy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ProxyActivity.class);
                startActivity(intent);
            }
        });

        btuDynamicProxy = findViewById(R.id.btu_dynamic_proxy);
        btuDynamicProxy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DynamicProxyActivity.class);
                startActivity(intent);
            }
        });


    }
}
