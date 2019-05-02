package com.eomsbd.eighteastersprayer.fragment.victory;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.eomsbd.eighteastersprayer.OnBackPressed;
import com.eomsbd.eighteastersprayer.R;
import com.eomsbd.eighteastersprayer.activity.MainActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class Victory4 extends Fragment implements OnBackPressed {

    LinearLayout button;

    public Victory4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_morning4, container, false);
        button = view.findViewById(R.id.backButton15);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), MainActivity.class);
                startActivity(i);
                getActivity().finish();
            }
        });
        return view;
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(getActivity(), MainActivity.class);
        startActivity(i);
    }
}
