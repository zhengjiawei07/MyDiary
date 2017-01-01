package com.example.laker.mydiary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;

public class EditActivity extends AppCompatActivity {
    private TextView tv1;
    private TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        tv1=(TextView) findViewById(R.id.edit_1);
        tv2=(TextView) findViewById(R.id.edit_2);
        Calendar time= Calendar.getInstance();
        int year=time.get(Calendar.YEAR);
        int month=time.get(Calendar.MONTH)+1;
        int day=time.get(Calendar.DATE);
        int week=time.get(Calendar.DAY_OF_WEEK)-1;
        String data="   "+day+"日/"+month+"月/"+year+"年";
        String Week="星期"+week;
        tv1.setText(data);
        tv2.setText(Week);
    }
}
