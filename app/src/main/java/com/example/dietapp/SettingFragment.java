package com.example.dietapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by kanako on 2017/06/09.
 */

public class SettingFragment extends Fragment {
    private static final String TAG="SettingFragment";
    private Button btnTEST;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.setting_fragment,container,false);
        btnTEST=(Button)view.findViewById(R.id.btnTEST4);

        btnTEST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "TESTING BUTTON CLICK 4",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
