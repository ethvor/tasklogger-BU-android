package com.ethvor.tasklogger;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;

public class ListViewFragment extends Fragment {
    private ViewModel viewModel;

    public ListViewFragment(){
        //public empty constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }
}
