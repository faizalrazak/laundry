package com.example.itrain.laundry;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import static com.example.itrain.laundry.R.id.increase;
import static com.example.itrain.laundry.R.id.view;


/**
 * A simple {@link Fragment} subclass.
 */
public class ClothesFragment extends Fragment {

    Button incrementBtn;
    Button decrementBtn;
    TextView number;

    public interface OnFragmentInteractionistener {
    }

            @Override
            public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
                View v = inflater.inflate(R.layout.fragment_clothes, container,false);
                number = (TextView) v.findViewById(R.id.integer_number);
                incrementBtn = (Button) v.findViewById(increase);
                decrementBtn = (Button) v.findViewById(R.id.decrease);


                incrementBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });
                decrementBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                        }
                    });


                return v;
            }
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}


