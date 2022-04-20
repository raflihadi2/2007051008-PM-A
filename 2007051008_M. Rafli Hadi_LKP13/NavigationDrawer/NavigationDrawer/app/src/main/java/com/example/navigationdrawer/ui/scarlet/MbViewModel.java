package com.example.navigationdrawer.ui.scarlet;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MbViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public MbViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Gigabyte B450M Gaming");
    }

    public LiveData<String> getText() {
        return mText;
    }
}