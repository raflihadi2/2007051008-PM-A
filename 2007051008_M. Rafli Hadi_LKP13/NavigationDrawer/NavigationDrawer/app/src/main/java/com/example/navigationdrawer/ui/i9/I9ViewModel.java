package com.example.navigationdrawer.ui.i9;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class I9ViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public I9ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Intel Core i9-10900k");
    }

    public LiveData<String> getText() {
        return mText;
    }
}