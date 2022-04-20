package com.example.bottomnavigation.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProcessorViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ProcessorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Intel Core i9 11900k");
    }

    public LiveData<String> getText() {
        return mText;
    }
}