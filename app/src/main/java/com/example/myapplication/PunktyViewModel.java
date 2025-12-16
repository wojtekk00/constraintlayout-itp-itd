package com.example.myapplication;

import androidx.lifecycle.ViewModel;

public class PunktyViewModel extends ViewModel {
    private int punkty = 0;

    public int getPunkty() {
        return punkty;
    }

    public void setPunkty(int punkty) {
        this.punkty = punkty;
    }

    public void addPunkty(int x){
        punkty += x;
    }
}
