package com.example.testviewmodel;


import android.os.CountDownTimer;
import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    // int num = 5;
    private MutableLiveData<Integer> mutableLiveData;

    public LiveData<Integer> randomnum() {

        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData<>();
            setdata();
        }


        return mutableLiveData;
    }

    public void setdata() {
        new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                int b = (int) (Math.random() * (400 - 200 + 1) + 200);

                mutableLiveData.setValue(b);

            }

            public void onFinish() {

            }

        }.start();
    }
}
