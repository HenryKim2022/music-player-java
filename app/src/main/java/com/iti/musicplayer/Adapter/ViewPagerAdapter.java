package com.iti.musicplayer.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.iti.musicplayer.TabFragment.TabOne;
import com.iti.musicplayer.TabFragment.TabThree;
import com.iti.musicplayer.TabFragment.TabTwo;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: return new TabOne();
            case 1: return new TabTwo();
            case 2: return new TabThree();
            default: return new TabOne();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
