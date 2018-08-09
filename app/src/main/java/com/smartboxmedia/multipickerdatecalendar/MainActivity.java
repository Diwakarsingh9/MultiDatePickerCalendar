package com.smartboxmedia.multipickerdatecalendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.timessquare.CalendarPickerView;

import java.util.Calendar;
import java.util.Date;

import static com.squareup.timessquare.CalendarPickerView.SelectionMode.RANGE;

public class MainActivity extends AppCompatActivity {

    private final int INVALID_VAL = -1;

    // Launches SublimePicker

    // Chosen values

    int mHour, mMinute;
    String mRecurrenceOption, mRecurrenceRule;
    CalendarPickerView calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar nextYear = Calendar.getInstance();
        calendar = (CalendarPickerView) findViewById(R.id.calendarPickerView);
        nextYear.add(Calendar.YEAR, 1);

        Date today = new Date();
        calendar.init(today, nextYear.getTime())
                .inMode(RANGE);
        calendar.selectDate(today);

        calendar.setOnDateSelectedListener(new CalendarPickerView.OnDateSelectedListener() {
            @Override
            public void onDateSelected(Date date) {
              //Do something when dates get selected
            }

            @Override
            public void onDateUnselected(Date date) {
                // when dates didnt get selected
            }
        });

    }
}
