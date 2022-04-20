package com.example.bottomnavigation.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MotherboardViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public MotherboardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Gigabyte B450M Gaming");
    }

    public LiveData<String> getText() {
        return mText;
    }
}