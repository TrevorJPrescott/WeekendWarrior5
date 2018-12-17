package com.trevorpc.weekendwarrior5.models;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Patterns;

public class Book {

    @NonNull
    String mUrl;
    @NonNull
    String mTitle;

    public Book(@NonNull String url, @NonNull String title) {
        this.mUrl = url;
        this.mTitle = title;
    }

    @NonNull
    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(@NonNull String mUrl) {
        this.mUrl = mUrl;
    }

    @NonNull
    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(@NonNull String mTitle) {
        this.mTitle = mTitle;
    }


}
