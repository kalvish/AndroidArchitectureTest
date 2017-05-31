package net.gamiya.androidarchitecturetest.viewmodel;


import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import net.gamiya.androidarchitecturetest.datamodel.User;

/**
 * Created by Vishwa on 5/31/17.
 */

public class UserProfileViewModel extends ViewModel {
    private String userId;
    private LiveData<User> user;

    public void init(String userId) {
        this.userId = userId;
    }
    public LiveData<User> getUser() {
        return user;
    }
}
