package com.example.harsmeet.login.deliveryDetails;
import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.harsmeet.login.R;

import java.util.Calendar;

/**
 * Created by harsmeet on 02-08-2018.
 */

public class Deliverydetails extends AppCompatActivity {


    RelativeLayout rl_time;
    RelativeLayout rl_date;
    TextView tv_enter_date;
    TextView tv_enter_time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.date_time_picker);

     rl_time = (RelativeLayout)findViewById(R.id.rl_time);
     rl_date = (RelativeLayout)findViewById(R.id.rl_date);
     tv_enter_date = (TextView)findViewById(R.id.tv_enter_date);
     tv_enter_time = (TextView)findViewById(R.id.tv_enter_time);

        try {

// select Date
            rl_date.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    final Calendar calendar = Calendar.getInstance();
                    int yy = calendar.get(Calendar.YEAR);
                    int mm = calendar.get(Calendar.MONTH);
                    int dd = calendar.get(Calendar.DAY_OF_MONTH);
                    DatePickerDialog datePicker = new DatePickerDialog(getApplicationContext(), new DatePickerDialog.OnDateSetListener() {
                        @SuppressLint("SetTextI18n")
                        @Override
                        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                            ++monthOfYear;
                            String mnth;

                            if (monthOfYear < 10) {
                                mnth = "0" + monthOfYear;
                            } else {
                                mnth = String.valueOf(monthOfYear);
                            }

                            String date = String.valueOf(year) + "-" + String.valueOf(mnth)
                                    + "-" + String.valueOf(dayOfMonth);

                            tv_enter_date.setText(date + "  ");
                        }
                    }, yy, mm, dd);
                    datePicker.show();

                }
            });

//        Select Time
            rl_time.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    // Get Current Time
                    final Calendar calendar = Calendar.getInstance();
                    int mHour = calendar.get(Calendar.HOUR_OF_DAY);
                    int mMinute = calendar.get(Calendar.MINUTE);

                    // Launch Time Picker Dialog
                    TimePickerDialog timePickerDialog = new TimePickerDialog(getApplicationContext(),
                            new TimePickerDialog.OnTimeSetListener() {

                                @SuppressLint("DefaultLocale")
                                @Override
                                public void onTimeSet(TimePicker view, int mHour, int mMinute) {

//                                            String time = String.valueOf(mHour) + ":" + String.valueOf(mMinute);
//                                            tv_set_time.setText(time);

                                    int hour = mHour % 12;
                                    if (hour == 0)
                                        hour = 12;
                                    tv_enter_time.setText(String.format("%02d:%02d %s", hour, mMinute,
                                            mHour < 12 ? "am" : "pm" + "  "));
                                }

                            }, mHour, mMinute, false);
                    timePickerDialog.show();

                }
            });


        }catch (Exception e){

            e.printStackTrace();
        }



    }

}
