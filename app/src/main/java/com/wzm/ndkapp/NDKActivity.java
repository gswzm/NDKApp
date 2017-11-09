package com.wzm.ndkapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NDKActivity extends AppCompatActivity {

    @BindView(R.id.tv_say)
    TextView tvSay;
    @BindView(R.id.et_a)
    EditText etA;
    @BindView(R.id.et_b)
    EditText etB;
    @BindView(R.id.btn_calculate)
    Button btnCalculate;
    @BindView(R.id.et_result)
    EditText etResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ndk);
        ButterKnife.bind(this);
        init();
    }

    private void init(){
        tvSay.setText(NDKUtils.sayHello());
        etResult.setFocusable(false);
    }
    @OnClick(R.id.btn_calculate)
    public void onViewClicked() {
        double a=Double.parseDouble(etA.getText().toString());
        double b=Double.parseDouble(etB.getText().toString());
        etResult.setText(NDKUtils.add(a,b)+"");
    }
}
