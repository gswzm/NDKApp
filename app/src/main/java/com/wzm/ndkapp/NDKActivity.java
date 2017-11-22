package com.wzm.ndkapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
/**
 * 类名： NDKActivity
 * 时间：2017/11/9 16:40
 * 描述：
 * 修改人：
 * 修改时间：
 * 修改备注：
 *
 * @author wangzm
*/
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
    @BindView(R.id.tv_array)
    TextView tvArray;

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

        int[] intArray={1,2,3,4};
        int[] ints=NDKUtils.getIntArray(intArray);

        for(int i: ints){
            tvArray.append(i+",");
        }
    }
}
