package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by SamerGigaByte on 14/06/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
