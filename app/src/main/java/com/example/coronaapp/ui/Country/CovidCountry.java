package com.example.coronaapp.ui.Country;

import android.os.Parcel;
import android.os.Parcelable;

public class CovidCountry implements Parcelable {

    String mCovidCountry, mCases, mDeaths, mTodayCases, mTodayDeaths, mRecovered, mActive, mCritical;

    public CovidCountry(String mCovidCountry, String mCases, String mDeaths, String mTodayCases, String mTodayDeaths, String mRecovered, String mActive, String mCritical) {
        this.mCovidCountry = mCovidCountry;
        this.mCases = mCases;
        this.mDeaths = mDeaths;
        this.mTodayCases = mTodayCases;
        this.mTodayDeaths = mTodayDeaths;
        this.mRecovered = mRecovered;
        this.mActive = mActive;
        this.mCritical = mCritical;
    }

    protected CovidCountry(Parcel in) {
        mCovidCountry = in.readString();
        mCases = in.readString();
        mDeaths = in.readString();
        mTodayCases = in.readString();
        mTodayDeaths = in.readString();
        mRecovered = in.readString();
        mActive = in.readString();
        mCritical = in.readString();
    }

    public static final Creator<CovidCountry> CREATOR = new Creator<CovidCountry>() {
        @Override
        public CovidCountry createFromParcel(Parcel in) {
            return new CovidCountry(in);
        }

        @Override
        public CovidCountry[] newArray(int size) {
            return new CovidCountry[size];
        }
    };

    public String getmCovidCountry() {
        return mCovidCountry;
    }

    public String getmCases() {
        return mCases;
    }

    public String getmDeaths() {
        return mDeaths;
    }

    public String getmTodayCases() {
        return mTodayCases;
    }

    public String getmTodayDeaths() {
        return mTodayDeaths;
    }

    public String getmRecovered() {
        return mRecovered;
    }

    public String getmActive() {
        return mActive;
    }

    public String getmCritical() {
        return mCritical;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mCovidCountry);
        dest.writeString(mCases);
        dest.writeString(mDeaths);
        dest.writeString(mTodayCases);
        dest.writeString(mTodayDeaths);
        dest.writeString(mRecovered);
        dest.writeString(mActive);
        dest.writeString(mCritical);
    }
}




