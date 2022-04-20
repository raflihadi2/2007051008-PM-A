package com.example.bottomnavigation.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class VgaViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public VgaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Nvidia Geforce RTX 3080");
    }

    public LiveData<String> getText() {
        return mText;
    }
}