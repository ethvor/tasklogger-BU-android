package com.ethvor.tasklogger;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.LinkedList;

public class viewModel extends ViewModel {
    private MutableLiveData<LinkedList<String>> tasksLinkedList;

    public viewModel(){
        tasksLinkedList = new MutableLiveData<>();
        LinkedList<String> tasks = new LinkedList<>();
        tasksLinkedList.setValue(tasks);
    }

    public void setTasksList(LinkedList<String> list){
        tasksLinkedList.setValue(list);
    }

    public MutableLiveData<LinkedList<String>> getTasksList(){
        return tasksLinkedList;
    }

    public void addTask(String string){
        LinkedList<String> list = new LinkedList<>();
        list.add(string);
        tasksLinkedList.setValue(list);
    }
}
