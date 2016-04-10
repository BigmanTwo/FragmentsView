package com.example.asus.fragmentsview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Asus on 2016/4/10.
 */
public class FragmentOne extends Fragment {
    private ImageView imageView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_one,null);
        imageView= (ImageView) view.findViewById(R.id.image);
        imageView.setImageResource(R.mipmap.beatiful);
        return view;
    }
}
