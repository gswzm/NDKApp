package com.wzm.ndkapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText(stringFromJNI());
        initView();
    }

    private void initView(){
        EditText etA=(EditText)findViewById(R.id.et_a);
        EditText etB=(EditText)findViewById(R.id.et_b);
        EditText etSin=(EditText)findViewById(R.id.et_sin);
        TextView tvAdd=(TextView)findViewById(R.id.tv_add);
        tvAdd.setOnClickListener((v)->{
            tvAdd.setText(""+getAdd(getIntNum(etA.getText().toString()),getIntNum(etB.getText().toString())));
        });
        Button BtnSin=(Button)findViewById(R.id.bt_sin);

        BtnSin.setText( ""+Math.sin(30));
        BtnSin.setOnClickListener((v)->{
           BtnSin.setText(""+getSin(Double.parseDouble(etSin.getText().toString())));
        });

    }
    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    public native int getAdd(int a,int b);

    public native double getSin(double a);

    private int getIntNum(String str){
        return Integer.parseInt(str);
    }
}
