
package com.agelmahdi.placesaround.Model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OpeningHours {

    @SerializedName("open_now")
    @Expose
    private Boolean mOpenNow;
    @SerializedName("weekday_text")
    @Expose
    private List<Object> mWeekdayText;

    public Boolean getOpenNow() {
        return mOpenNow;
    }

    public void setOpenNow(Boolean openNow) {
        mOpenNow = openNow;
    }

    public List<Object> getWeekdayText() {
        return mWeekdayText;
    }

    public void setWeekdayText(List<Object> weekdayText) {
        mWeekdayText = weekdayText;
    }

}
