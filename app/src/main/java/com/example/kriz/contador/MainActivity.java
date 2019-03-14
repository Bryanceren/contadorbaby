package com.example.kriz.contador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView counterTxt1;
    private TextView counterTxt2;
    private Button minusBtn;
    private Button plusBtn;
    private int counter1;
    private int counter2;

    private View.OnClickListener clickListener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            switch (view.getId()){
                case R.id.minusBtn:
                    minusCounter();
                    break;
                case R.id.plusBtn:
                    plusCounter();
                    break;

            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counterTxt1= findViewById(R.id.counterTxt1);
        counterTxt1= findViewById(R.id.counterTxt2);
        minusBtn= findViewById(R.id.minusBtn);
        minusBtn.setOnClickListener(clickListener);
        plusBtn= findViewById(R.id.plusBtn);
        plusBtn.setOnClickListener(clickListener);
        initCounter();

    }
    private void initCounter(){
        counter1=0;
        counter2=0;
        counterTxt1.setText(counter1);
        counterTxt2.setText(counter1);

    }
    private void plusCounter(){
        counter2++;
        counterTxt2.setText(counter2);
    }
    ;
    private void minusCounter(){
        counter1++;
        counterTxt1.setText(counter1);

    }
}
