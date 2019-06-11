package com.example.testfunc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.content.Intent;
import android.widget.Button;
import com.example.testfunc.alarmclock;
public class MainActivity extends AppCompatActivity {

    alarmclock clk=new alarmclock();
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,TTsActivity.class);
                Bundle mBundle=new Bundle();
                mBundle.putSerializable("clk",clk);
                intent.putExtras(mBundle);
                startActivity(intent);
            }
        });



    }

}
