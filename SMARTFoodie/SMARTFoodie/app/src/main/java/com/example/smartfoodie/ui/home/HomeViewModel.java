package com.example.smartfoodie.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This would be the profile of the user with information such as name, weight, height etc.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}