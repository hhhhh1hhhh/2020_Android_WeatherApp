package com.cookandroid.androidweatherappv2.Retrofit;

import com.cookandroid.androidweatherappv2.Model.WeatherResult;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IOpenWeaatherMap {
    @GET("weather")
    Observable<WeatherResult> getWeatherByLatLng(@Query("lat") String lat,
                                                 @Query("lon") String Lng,
                                                 @Query("appid") String appid,
                                                 @Query("units") String unit);
}
