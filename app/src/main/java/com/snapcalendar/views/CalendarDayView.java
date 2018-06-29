package com.snapcalendar.views;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.androidcalendar.R;
import com.snapcalendar.objects.CalendarDate;


public class CalendarDayView extends LinearLayout {

    private CalendarDate mCalendarDate;
    private TextView mTextDay;
    private View mLayoutBackground;

    public CalendarDayView(Context context, CalendarDate calendarDate) {
        super(context);
        mCalendarDate = calendarDate;
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.view_calendar_day, this);
        mLayoutBackground = findViewById(R.id.view_calendar_day_layout_background);
        mTextDay = (TextView) findViewById(R.id.view_calendar_day_text);
        mTextDay.setText("" + mCalendarDate.getDay());
    }

    public CalendarDate getDate() {
        return mCalendarDate;
    }

    public void setThisMonthTextColor() {
        mTextDay.setTextColor(ContextCompat.getColor(getContext(), R.color.white));
    }

    public void setOtherMonthTextColor() {
        mTextDay.setTextColor(ContextCompat.getColor(getContext(), R.color.grey));
    }

    public void setRedTextColor() {
        mTextDay.setTextColor(ContextCompat.getColor(getContext(), R.color.red));
    }

    public void setPurpleSolidOvalBackground() {
        mLayoutBackground.setBackgroundResource(R.drawable.oval_purple_solid);
    }

    public void unsetPurpleSolidOvalBackground() {
        mLayoutBackground.setBackgroundResource(R.drawable.oval_black_solid);
    }

    public void setRedOvalCurrentDate() {
        mLayoutBackground.setBackgroundResource(R.drawable.oval_yellow_solid);
    }



}
