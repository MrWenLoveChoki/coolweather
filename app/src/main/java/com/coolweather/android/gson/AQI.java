package com.coolweather.android.gson;

/**
 * Created by Mr_Wen on 2018/1/5.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
