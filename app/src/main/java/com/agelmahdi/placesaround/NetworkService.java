package com.agelmahdi.placesaround;

import com.agelmahdi.placesaround.Model.Main;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Ahmed El-Mahdi on 11/11/2017.
 */

public interface NetworkService {
    @GET("/maps/api/place/search/json?sensor=true&key=AIzaSyAUKipHmv6UbaJE68_0jX9dZySYV0bLsGU")
    Call<Main> getNearbyPlaces(@Query("type") String type, @Query("location") String location, @Query("radius") int radius);
}
