package com.tcet.rcare.navigation;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;


import com.tcet.rcare.R;


public class SettingsFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preferences, rootKey);
    }
}
