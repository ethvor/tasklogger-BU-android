package com.ethvor.tasklogger;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TaskEnterFragment extends Fragment{
    private ViewModel viewModel;

    public TaskEnterFragment(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_task_enter, container, false);
    }

}
