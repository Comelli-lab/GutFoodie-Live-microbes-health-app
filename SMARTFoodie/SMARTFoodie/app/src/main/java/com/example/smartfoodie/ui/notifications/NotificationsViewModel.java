package com.example.smartfoodie.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotificationsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public NotificationsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Here the user would be able to see notifications about foods soon to expire.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}