package rannver.designpattern.simpleFactoryPattern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rannver.designpattern.R;

/**
 * Created by Rannver on 2018/3/15.
 */

public class FactoryActivity extends AppCompatActivity {
    @BindView(R.id.btu_circle)
    Button btuCircle;
    @BindView(R.id.btu_square)
    Button btuSquare;
    @BindView(R.id.btu_rectangle)
    Button btuRectangle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_factory_activity);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btu_circle, R.id.btu_square, R.id.btu_rectangle})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btu_circle:
                Circle circle = ShapeFactory.getClass(Circle.class);
                circle.draw();
                break;
            case R.id.btu_square:
                Square square = ShapeFactory.getClass(Square.class);
                square.draw();
                break;
            case R.id.btu_rectangle:
                Rectangle rectangle = ShapeFactory.getClass(Rectangle.class);
                rectangle.draw();
                break;
        }
    }
}
