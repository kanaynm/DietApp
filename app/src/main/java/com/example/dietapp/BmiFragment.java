package com.example.dietapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by kanako on 2017/06/09.
 */

public class BmiFragment extends Fragment {
    private static final String TAG="BmiFragment";
    private Button btnTEST;
    private TextView editText,textView;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.bmi_fragment,container,false);
        btnTEST=(Button)view.findViewById(R.id.btnTEST2);
        textView = (TextView)view.findViewById(R.id.text_view);
        editText =(EditText)view.findViewById(R.id.edit_text);

        btnTEST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // エディットテキストのテキストを取得
                String text = editText.getText().toString();
                // 取得したテキストを TextView に張り付ける
                textView.setText(text);
            }
        });
        return view;
    }
}
