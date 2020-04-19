package com.example.sandwish;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.sandwish.databinding.FragmentHomeBinding;


public class HomeFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final FragmentHomeBinding fragmentHomeBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_home,container,false);
        final View view = fragmentHomeBinding.getRoot();
        fragmentHomeBinding.startordering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentHomeBinding.allowdevice.setVisibility(View.VISIBLE);
            }
        });

        return view;

    }



}
