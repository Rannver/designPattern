package rannver.designpattern;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import rannver.designpattern.builderPattern.BuilderActivity;
import rannver.designpattern.prototypePattern.PrototypeActivity;
import rannver.designpattern.simpleFactoryPattern.FactoryActivity;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btu_bulider)
    Button btuBulider;
    @BindView(R.id.btu_prototype)
    Button btuPrototype;
    @BindView(R.id.btu_simple_factory)
    Button btuSimpleFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //建造者模式
        btuBulider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BuilderActivity.class);
                startActivity(intent);
            }
        });

        btuPrototype.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PrototypeActivity.class);
                startActivity(intent);
            }
        });

        btuSimpleFactory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FactoryActivity.class);
                startActivity(intent);
            }
        });


    }
}
