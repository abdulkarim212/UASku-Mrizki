package com.example.mrizki.biodata.model;
// 10116162-Muhammad rizki-if4-12/08/2019
import android.support.v4.app.Fragment;

public interface IFragmentAdapter {
    void add(Fragment Frag, String Title);
    Fragment getItem(int position);
    CharSequence getPageTitle(int position);
    int getCount();
}
