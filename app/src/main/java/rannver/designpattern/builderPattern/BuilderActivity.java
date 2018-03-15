package rannver.designpattern.builderPattern;

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
 * Created by Rannver on 2018/3/14.
 */

public class BuilderActivity extends AppCompatActivity {

    @BindView(R.id.btu_board)
    Button btuBoard;
    @BindView(R.id.btu_diaplay)
    Button btuDiaplay;
    @BindView(R.id.btu_os)
    Button btuOs;
    @BindView(R.id.btu_build)
    Button btuBuild;
    @BindView(R.id.tv_str)
    TextView tvStr;

    private String board;
    private String display;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.builder_activity);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btu_board, R.id.btu_diaplay, R.id.btu_os, R.id.btu_build})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btu_board:
                board = btuBoard.getText().toString();
                break;
            case R.id.btu_diaplay:
                display = btuDiaplay.getText().toString();
                break;
            case R.id.btu_os:
                break;
            case R.id.btu_build:
                Computer computer =new MacbookBuilder().buildBoard(board).buildDisplay(display).buildOS().create();
                tvStr.setText(computer.toString());
                break;
        }
    }
}
