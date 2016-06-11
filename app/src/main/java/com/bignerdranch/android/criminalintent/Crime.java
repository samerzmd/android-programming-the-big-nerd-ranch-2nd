package com.bignerdranch.android.criminalintent;

import java.util.UUID;

/**
 * Created by SamerGigaByte on 09/06/2016.
 */
public class Crime {
    private UUID mId;

    private String mTitle;

    public Crime() {
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
